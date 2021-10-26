package com.zj.cro;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author zhoujian
 *
 * 规范响应的数据，也就是说统一响应数据的格式
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseCommon <T> implements Serializable {

    private String status;
    private String msg;

    private T data;

    public ResponseCommon(String status ,String msg){
        this.status = status;
        this.msg = msg;
    }
}
