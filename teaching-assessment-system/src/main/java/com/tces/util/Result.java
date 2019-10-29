package com.tces.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 后台数据返回的包装对象
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    // 状态 200,400,500
    private int status;
    // 信息
    private String meg;
    // 数据
    private Object data;

    public static Result ok(Object data) {
        return new Result(200, "ok", data);
    }

    public static Result ok() {
        return new Result(200, "ok", null);
    }

    public static Result fail(String msg) {
        return new Result(500, msg, null);
    }

    public static Result fail(int code, String msg) {
        return new Result(code, msg, null);
    }
}
