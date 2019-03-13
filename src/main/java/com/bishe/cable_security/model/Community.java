package com.bishe.cable_security.model;

import lombok.Data;

/**
 * 小区
 */
@Data
public class Community {
    /**
     * 小区编号
     */
    private String no;
    /**
     * 小区名称
     */
    private String name;
    /**
     * 地址
     */
    private String address;
    /**
     * 负责人姓名
     */
    private String principalName;
    /**
     * 负责人联系方式
     */
    private int principalTel;
}
