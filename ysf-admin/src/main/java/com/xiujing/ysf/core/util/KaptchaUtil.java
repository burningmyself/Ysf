package com.xiujing.ysf.core.util;

import com.xiujing.ysf.config.properties.YsfProperties;

/**
 * 验证码工具类
 */
public class KaptchaUtil {

    /**
     * 获取验证码开关
     */
    public static Boolean getKaptchaOnOff() {
        return SpringContextHolder.getBean(YsfProperties.class).getKaptchaOpen();
    }
}