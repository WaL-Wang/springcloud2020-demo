package com.wal.commons.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor//全参构造
@NoArgsConstructor//空参构造
@Builder
public class Payment implements Serializable {
    private Long id ;
    private String serial;
}
