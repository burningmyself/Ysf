package com.xiujing.ysf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot方式启动类
 *
 * @author xiujing
 * @Date 2017/5/21 12:06
 */
@SpringBootApplication
public class YsfApplication {

    private final static Logger logger = LoggerFactory.getLogger(YsfApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(YsfApplication.class, args);
        logger.info("YsfApplication is success!");
    }
}
