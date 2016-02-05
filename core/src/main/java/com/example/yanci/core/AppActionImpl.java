package com.example.yanci.core;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import com.example.yanci.api.Api;
import com.example.yanci.api.ApiImpl;
import com.example.yanci.api.ApiResponse;
import com.example.yanci.model.LoginResponse;

/**
 * Created by yanci on 16/1/29.
 */
public class AppActionImpl implements AppAction{
    private Api api;

    public AppActionImpl(Context context) {
        this.api = new ApiImpl();
    }

    @Override
    public void loginByPhone(final String phone, final String password,final AppActionCallbackListener<LoginResponse> listener) {
        // 1.判断参数格式是否正确

        // 2.请求Api
        new AsyncTask<Void,Void,ApiResponse<LoginResponse>>() {
            @Override
            protected ApiResponse<LoginResponse> doInBackground(Void... params) {
                return api.loginByPhone(phone,password);
            }

            @Override
            protected void onPostExecute(ApiResponse<LoginResponse> loginResponseApiResponse) {
               if (listener != null && loginResponseApiResponse != null) {
                   if (loginResponseApiResponse.isSuccess()) {
                       listener.onSuccess((LoginResponse)loginResponseApiResponse.getRes());
                   } else {
                        listener.onFailure(loginResponseApiResponse.getStatus(),loginResponseApiResponse.getError());
                   }
               }
            }
        }.execute();
    }
}
