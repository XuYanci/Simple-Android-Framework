package com.example.yanci.simplehttpframework.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.yanci.core.AppActionCallbackListener;
import com.example.yanci.model.LoginResponse;
import com.example.yanci.simplehttpframework.R;

/**
 * Login Actvity
 * Created by yanci on 16/1/31.
 */
public class LoginActivity extends  KBaseActivity{

    private static final String TAG = "LOGIN_ACTIVITY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Initial user interface
        final EditText edittext_username = (EditText)findViewById(R.id.et_username);
        final EditText editText_password = (EditText)findViewById(R.id.et_password);
        Button btn_login = (Button)findViewById(R.id.btn_login);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                appAction.loginByPhone(edittext_username.getText().toString(),
                        editText_password.getText().toString(),
                        new AppActionCallbackListener<LoginResponse>() {
                    @Override
                    public void onSuccess(LoginResponse data) {
                        Log.i(TAG,"success");
                    }

                    @Override
                    public void onFailure(String errorEvent, String message) {
                        Log.i(TAG,"fail");
                    }
                });
            }
        });


    }
}
