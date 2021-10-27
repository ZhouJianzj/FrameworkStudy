package com.zj.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author zhoujian
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
/**
 * 统一响应体
 */
public class CommonResponse<T>   implements Serializable   {

    private Integer status;
    private String msg;

    private T data;

    public CommonResponse(Integer status ,String msg){
        this.status = status;
        this.msg = msg;
    }
}
