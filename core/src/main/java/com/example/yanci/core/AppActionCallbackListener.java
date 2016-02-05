package com.example.yanci.core;

import com.example.yanci.model.LoginResponse;

/**
 * Created by yanci on 16/1/29.
 */
public interface AppActionCallbackListener<T> {
    /**
     * 成功时调用
     *
     * @param data 返回的数据
     */
    public void onSuccess(T data);

    /**
     * 失败时调用
     *
     * @param errorEvent 错误码
     * @param message    错误信息
     */
    public void onFailure(String errorEvent, String message);
}
