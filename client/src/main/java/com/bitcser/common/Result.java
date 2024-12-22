package com.bitcser.common;

import lombok.Data;

/**
 * 统一返回的包装类
 */

@Data
public class Result {

    private Integer code;
    private String msg;
    private Object data;

    public static Result success() {
        Result result = new Result();
        result.setCode(200);
        result.setMsg("请求成功");
        return result;
    }

    public static Result success(Object data) {
        Result result = success();
        result.setData(data);
        return result;
    }

    public static Result error() {
        Result result = new Result();
        result.setCode(500);
        result.setMsg("系统错误");
        return result;
    }

    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

}
