package com.xiujing.ysf.multi.test;

import com.xiujing.ysf.base.BaseJunit;
import com.xiujing.ysf.multi.service.TestService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 业务测试
 *
 * @author fengshuonan
 * @date 2017-06-23 23:12
 */
public class BizTest extends BaseJunit {

    @Autowired
    TestService testService;

    @Test
    public void test() {
        testService.testYsf();

        testService.testBiz();

        //testService.testAll();
    }
}
