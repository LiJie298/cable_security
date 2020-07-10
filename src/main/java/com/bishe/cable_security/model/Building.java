package com.bishe.cable_security.model;

import lombok.Data;

//单元楼
@Data
public class Building {
    /**
     * 小区编号
     */
    private String cNo;
    /**
     * 编号
     */
    private String no;
    /**
     * 名称
     */
    private String name;
    /**
     * 可住用户数量（电缆数量）
     */
    private int userNumber;
}
