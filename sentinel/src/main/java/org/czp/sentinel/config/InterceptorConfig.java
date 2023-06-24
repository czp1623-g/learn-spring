package org.czp.sentinel.config;

import com.alibaba.csp.sentinel.adapter.spring.webmvc.SentinelWebInterceptor;
import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.DefaultBlockExceptionHandler;
import com.alibaba.csp.sentinel.adapter.spring.webmvc.config.SentinelWebMvcConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        SentinelWebMvcConfig config = new SentinelWebMvcConfig();
        config.setBlockExceptionHandler(new DefaultBlockExceptionHandler());
        // 是否需要给资源名称加上HttpMethod前缀
        config.setHttpMethodSpecify(true);
        // 从请求头中获取S-user参数的值作为调用来源名称
        config.setOriginParser(r -> r.getHeader("S-user"));
        registry.addInterceptor(new SentinelWebInterceptor(config))
                .addPathPatterns("/stn/**");

        WebMvcConfigurer.super.addInterceptors(registry);
    }
}
