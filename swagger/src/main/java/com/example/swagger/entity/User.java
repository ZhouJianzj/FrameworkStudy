package com.example.swagger.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


/**
 * @author zhoujian
 *
 * 需要展示的时候没有model属性的时候
 * 你需要添加setter and  getter方法
 */
@ApiModel(value = "user",description = "user对象")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    /**
     * 指定model的属性
     */
    @ApiModelProperty(value = "name" ,name = "用户名",example = "alis",
            notes = "用户的用名字，是唯一的",required = true,hidden = false)
    private String name;


    @ApiModelProperty(value = "password" ,name = "密码", example = "123123",
            notes = "密码加密",required = true ,hidden = false)
    private String password;


}
