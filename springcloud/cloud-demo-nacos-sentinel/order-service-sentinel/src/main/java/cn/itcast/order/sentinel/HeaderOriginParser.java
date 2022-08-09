package cn.itcast.order.sentinel;

import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.RequestOriginParser;
import io.netty.util.internal.StringUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * sentinel 授权策略使用的，这里是获取请求头中我们自己规定的参数,(这里我们在gateway中的默认过滤器中对请求头添加了参数
 * (origin=fromGateway)
 * 参数表示的是我们对请求来源命名，方便与sentinel授权配置中的值做验证
 *
 * @author zhoujian
 */
@Component
public class HeaderOriginParser implements RequestOriginParser {
    @Override
    public String parseOrigin(HttpServletRequest httpServletRequest) {
        String origin = httpServletRequest.getHeader("origin");

        System.err.println(origin);

        if (StringUtils.isEmpty(origin)){
            return "blank";
        }
        return origin;
    }
}
