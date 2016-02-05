package com.example.yanci.api;


import com.example.yanci.model.LoginResponse;

/**
 * Created by yanci on 16/1/27.
 */
public interface Api {
    public final static String LOGIN = "customer.login";

    /**
     * Login By App
     * @param phone
     * @param password
     * @return
     */
    public ApiResponse<LoginResponse> loginByPhone(String phone,String password);
}
