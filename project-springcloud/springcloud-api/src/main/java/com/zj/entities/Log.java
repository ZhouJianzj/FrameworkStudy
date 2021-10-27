package com.zj.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Log {
    private Integer id;
    private String username;
    private String url;
    private String module;
    private Date starttime;

    public Log(String username, String url, String module, Date starttime) {
        this.username = username;
        this.url = url;
        this.module = module;
        this.starttime = starttime;
    }
}
