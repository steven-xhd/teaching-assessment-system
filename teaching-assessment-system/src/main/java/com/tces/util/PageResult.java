package com.tces.util;

import lombok.Data;

import java.util.List;

/**
 * 分页查询的包装类
 */
@Data
public class PageResult {
    private List data;
    private int count;
}
