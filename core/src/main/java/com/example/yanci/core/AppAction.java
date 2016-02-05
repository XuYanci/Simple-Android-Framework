package com.example.yanci.core;

import com.example.yanci.model.LoginResponse;

/**
 * Created by yanci on 16/1/29.
 */
public interface AppAction {
    /**
     * 用户手机登陆
     * @param phone
     * @param password
     */
    public void  loginByPhone(String phone,String password,AppActionCallbackListener<LoginResponse> listener);



}
