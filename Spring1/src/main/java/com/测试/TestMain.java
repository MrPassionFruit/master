package com.测试;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: wangxuefeng@hsgene.com
 * @Description:
 * @Date: Created in 16:30 2018/3/8
 * @Modified By:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestConfig.class})
@ActiveProfiles("pro")
public class TestMain
{
    @Autowired
    private TestDemo testDemo;

    @Test
    public void proBean(){
        String expected ="pro";
        Assert.assertEquals(expected,testDemo.getTest());
    }
}
