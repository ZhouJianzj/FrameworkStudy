package com.zj.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class Dept {
    Integer id;
    String name;
    String db_source;//指的是数据来自哪个数据库
}