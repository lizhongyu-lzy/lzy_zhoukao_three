package com.lzy.hetong.service.impl;

import com.lzy.hetong.dao.HetongMapper;
import com.lzy.hetong.dao.HuiKuanMapper;
import com.lzy.hetong.pojo.Hetong;
import com.lzy.hetong.pojo.HuiKuan;
import com.sun.org.apache.bcel.internal.generic.NEW;
import javafx.concurrent.Task;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.persistence.criteria.*;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class HeTongServiceImplTest {

    @Autowired
    private HetongMapper hetongMapper;
    @Autowired
    private HuiKuanMapper huiKuanMapper;

    @Test
    @Transactional
    public void deleteAll() {
       /* Specification<HuiKuan> specification = new Specification() {


            @Override
            public Predicate toPredicate(Root root, CriteriaQuery criteriaQuery, CriteriaBuilder cb) {
                Predicate p1 = cb.equal(root.get("hetong").get("descs"), "dd");


                return cb.and(p1);
            }
        };*/
//        List<HuiKuan> huiKuans = huiKuanMapper.findAll(specification);


        List<String> list = new ArrayList<>();
        list.add("yue1001");
        list.add("yue1002");

        huiKuanMapper.deleteByIds(list);

//        Specification<Hetong> specification = new Specification<Hetong>() {
//            @Override
//            public Predicate toPredicate(Root<Hetong> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder cb) {
//                Predicate p1 = cb.equal(root.join("").get("huiKuans").get("descs"), "aa");
//
//                return cb.and(p1);
//            }
//        };
//        Specification<Hetong> specification = new Specification<Hetong>() {
//            @Override
//            public Predicate toPredicate(Root root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder cb) {
//                Predicate p1 = cb.equal(root.get("huiKuans").get("descs"), "vv");
//
//                return cb.and(p1);
//            }
//        };


////        System.out.println(huiKuans);
//        Page<Hetong> all = hetongMapper.findAll(specification, PageRequest.of(0, 3));
//        System.out.println(all);

    }
}