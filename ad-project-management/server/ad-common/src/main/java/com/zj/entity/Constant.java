package com.zj.entity;

import lombok.Getter;

/**
 * 枚举类的使用
 */
@Getter
public enum  Constant {
    VIAL(1,"有效状态"),
    INVAIL(0,"无效状态");

    private Integer status;
    private String des;

    Constant(Integer status, String des){
        this.status = status;
        this.des = des;
    }
}
