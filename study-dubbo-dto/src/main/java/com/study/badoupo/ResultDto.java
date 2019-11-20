package com.study.badoupo;

import lombok.Data;

@Data
public class ResultDto<T> {
    private String code = "0";
    private String error;
    private T data;

    public static <T> ResultDto<T> ok(T data) {
        ResultDto<T> resultDto = new ResultDto<>();
        resultDto.data = data;
        return resultDto;
    }
}
