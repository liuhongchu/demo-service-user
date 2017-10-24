package com.example.config;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by liuhongchun on 2017/10/24.
 */
@ApiModel(description = "Api请求响应结果")
public class ApiResult {
    public static final int SUCCESS = 0;
    public static final int FAIL = 1;

    @ApiModelProperty(value = "响应结果编码。0：成功；1：失败")
    private int code;
    @ApiModelProperty(value = "响应结果描述。")
    private String message;
    @ApiModelProperty("响应数据")
    private Object data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
