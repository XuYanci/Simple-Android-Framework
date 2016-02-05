package com.example.yanci.api;

/**
 * Created by yanci on 16/1/27.
 */
public class ApiResponse<T> {


    private String status;  /* success when status = 1 , fail when status = 0 */
    private String error;   /* error message when status fail */

    private T res;          /* response object */

    public ApiResponse(String status,String error) {
        this.status = status;
        this.error = error;
    }

    public boolean isSuccess() {
        if (this.status.equals("0"))
        { return  false; }
        return true;
    }

    public T getRes() {
        return res;
    }

    public void setRes(T res) {
        this.res = res;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
