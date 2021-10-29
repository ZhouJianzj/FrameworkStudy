package com.zj.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
public class User implements Serializable {
    Integer id;
    String username;
    String password;
    String salt;
    String phone;
    List<Role> roles;
    String toke;
}