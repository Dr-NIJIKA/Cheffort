package com.itlsc.common; // 建议放在 common 包下

import lombok.Data;
import java.io.Serializable;

@Data
public class Result<T> implements Serializable {

    private Integer code; // 编码：1成功，0为失败
    private String msg;   // 错误信息
    private T data;       // 数据（使用泛型 T 代替 Object）

    public static <T> Result<T> success() {
        Result<T> result = new Result<>();
        result.code = 1;
        result.msg = "success";
        return result;
    }

    public static <T> Result<T> success(T object) {
        Result<T> result = new Result<>();
        result.data = object;
        result.code = 1;
        result.msg = "success";
        return result;
    }

    public static <T> Result<T> error(String msg) {
        Result<T> result = new Result<>();
        result.msg = msg;
        result.code = 0;
        return result;
    }
}