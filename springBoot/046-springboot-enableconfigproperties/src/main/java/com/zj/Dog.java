package com.zj;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;



@ConfigurationProperties(prefix = "dog")
@Data
public class Dog {
    String name;
}
