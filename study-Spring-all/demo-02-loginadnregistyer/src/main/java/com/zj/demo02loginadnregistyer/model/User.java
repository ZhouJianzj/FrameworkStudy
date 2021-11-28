package com.zj.demo02loginadnregistyer.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Integer uuid;
    private String userName;
    private Integer password;
    private String realName;

}
