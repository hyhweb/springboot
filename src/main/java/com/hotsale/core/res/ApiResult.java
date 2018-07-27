package com.hotsale.core.res;

import com.hotsale.core.constant.MsgCode;

/**
 * Created by  hyhadmin on 2018/7/23.
 */
public class ApiResult<T> {
    private T data;

    private String code;

    private boolean isSuccess;

    private String msg;

    public ApiResult() {
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static ApiResult  success(){
        return ApiResult.success(null);
    }

    public static ApiResult  success(Object data){
        ApiResult apiResult = new ApiResult();
        apiResult.setSuccess(true);
        apiResult.setData(data);
        apiResult.setCode(MsgCode.SUCCESS);
        apiResult.setMsg("操作成功");
        return apiResult;
    }

    public static ApiResult  fail(String message){
        ApiResult apiResult = new ApiResult();
        apiResult.setSuccess(false);
        apiResult.setCode(MsgCode.ERROR);
        apiResult.setMsg(message);
        return apiResult;
    }

    public static ApiResult  fail(String code, String message){
        ApiResult apiResult = new ApiResult();
        apiResult.setSuccess(false);
        apiResult.setCode(code);
        apiResult.setMsg(message);
        return apiResult;
    }

}
