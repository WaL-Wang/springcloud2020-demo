package com.wal.commons.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Res<T> {
    private Integer code;
    private String message;
    private T data;

    public Res(Integer code, String message){
        this(code,message,null);
    }
}
