package com.bishe.cable_security.model;


public enum Role {
    //管理员
    ADMIN("0"),
    //负责人
    PRINCIPAL("1"),
    //普通用户
    NORMAL("2");

    private String  type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private  Role(String type){
        this.type=type;
    }

}
