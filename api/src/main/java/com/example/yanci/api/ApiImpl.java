package com.example.yanci.api;

import com.example.yanci.api.net.BaseHttpHandler;
import com.example.yanci.model.LoginResponse;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yanci on 16/1/27.
 */
public class ApiImpl implements Api {

    private final static String TIME_OUT_EVENT = "0";
    private final static String TIME_OUT_EVENT_MSG = "连接服务器失败";

    private BaseHttpHandler httpHandler;

    public ApiImpl() { httpHandler = BaseHttpHandler.getInstance();}

    @Override
    public ApiResponse<LoginResponse> loginByPhone(String phone, String password) {
        Map<String,String> paramMap = new HashMap<>();
        paramMap.put("phone",phone);
        paramMap.put("password",password);
        Type type = new TypeToken<ApiResponse<LoginResponse>>(){}.getType();

        try {
            return httpHandler.HttpPostRequest(BaseHttpHandler.REQUEST_LOGINBYPHONE,paramMap,type);
        } catch (IOException e) {
            return new ApiResponse(TIME_OUT_EVENT, TIME_OUT_EVENT_MSG);
        }
    }
}
