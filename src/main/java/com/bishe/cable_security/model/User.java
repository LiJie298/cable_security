package com.bishe.cable_security.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

//用户
//@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
//@Table(name="user")
public class User {
    /**
     * 编号
     */
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private int no;
    /**
     * 姓名
     */
    private String name;
    /**
     * 权限
     */
    private Role role;
    /**
     * 小区编号
     */
    private String cNo;
    /**
     * 单元楼编号
     */
    private String bNo;
    /**
     * 电话
     */
    private int tel;
    /**
     * 账号信息
     */
    private String account;
    /**
     * 密码
     */
    private String password;
    /**
     * 创建时间
     */
    private Date createTime;

    public User(String name,String password) {
        this.name = name;
        this.password = password;
        this.role = Role.NORMAL;
    }
    public User(String name) {
        this.name = name;
        this.role = Role.NORMAL;
    }

}
