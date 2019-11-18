package com.lzy.hetong.service.impl;

import com.lzy.hetong.dao.HuiKuanMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class HeTongServiceImplTest {

    @Autowired
    private HuiKuanMapper huiKuanMapper;
    @Test
    public void deleteAll() {
        huiKuanMapper.deleteById("余款1001");

    }
}