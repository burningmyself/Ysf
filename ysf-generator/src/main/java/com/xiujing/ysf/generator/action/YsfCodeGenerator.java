package com.xiujing.ysf.generator.action;


import com.xiujing.ysf.generator.action.config.YsfGeneratorConfig;

/**
 * 代码生成器,可以生成实体,dao,service,controller,html,js
 *
 * @author xiujing
 * @Date 2017/5/21 12:38
 */
public class YsfCodeGenerator {

    public static void main(String[] args) {

        /**
         * Mybatis-Plus的代码生成器:
         *      mp的代码生成器可以生成实体,mapper,mapper对应的xml,service
         */
        YsfGeneratorConfig ysfGeneratorConfig = new YsfGeneratorConfig();
        ysfGeneratorConfig.doMpGeneration();

        /**
         * ysf的生成器:
         *      ysf的代码生成器可以生成controller,html页面,页面对应的js
         */
        ysfGeneratorConfig.doYsfGeneration();
    }

}