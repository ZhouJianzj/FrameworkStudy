package com.zj.config;

import org.springframework.context.annotation.ComponentScan;

/**
 *
 扫描不是默认包下的所有类
 * @author zhoujian
 */
@ComponentScan("com.cn")
@org.springframework.context.annotation.Configuration
public class Configuration {

}
