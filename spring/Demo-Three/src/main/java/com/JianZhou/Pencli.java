package com.JianZhou;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Pencli {
    @Value("1001")
    private int id;
    @Value("Color - back")
    private String style;
    @Autowired(required = false)
    @Qualifier("student")
    private Student student;

    @Override
    public String toString() {
        return "Pencli{" +
                "id=" + id +
                ", style='" + style + '\'' +
                ", student=" + student +
                '}';
    }
}
