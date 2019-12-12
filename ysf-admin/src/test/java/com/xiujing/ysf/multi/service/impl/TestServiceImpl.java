package com.xiujing.ysf.multi.service.impl;

import com.xiujing.ysf.core.common.constant.DatasourceEnum;
import com.xiujing.ysf.core.mutidatasource.annotion.DataSource;
import com.xiujing.ysf.multi.entity.Test;
import com.xiujing.ysf.multi.mapper.TestMapper;
import com.xiujing.ysf.multi.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author fengshuonan
 * @since 2018-07-10
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    @DataSource(name = DatasourceEnum.DATA_SOURCE_BIZ)
    @Transactional
    public void testBiz() {
        Test test = new Test();
        test.setBbb("bizTest");
        testMapper.insert(test);
    }

    @Override
    @DataSource(name = DatasourceEnum.DATA_SOURCE_GUNS)
    @Transactional
    public void testYsf() {
        Test test = new Test();
        test.setBbb("ysfTest");
        testMapper.insert(test);
    }

    @Override
    @Transactional
    public void testAll() {
        testBiz();
        testYsf();
        //int i = 1 / 0;
    }

}
