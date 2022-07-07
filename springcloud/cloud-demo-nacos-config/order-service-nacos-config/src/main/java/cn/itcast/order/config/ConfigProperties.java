package cn.itcast.order.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author zhoujian
 */
@Data
@Component
@ConfigurationProperties(prefix = "pattern")
public class ConfigProperties {
    private String dateformat;
}
