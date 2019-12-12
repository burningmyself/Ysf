package com.xiujing.ysf;

import com.xiujing.ysf.YsfApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Ysf Web程序启动类
 *
 * @author fengshuonan
 * @date 2017-05-21 9:43
 */
public class YsfServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(YsfApplication.class);
    }
}
