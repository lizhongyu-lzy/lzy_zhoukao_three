package com.lzy.hetong.service.impl;

import com.lzy.hetong.dao.HuiKuanMapper;
import com.lzy.hetong.pojo.Hetong;
import com.lzy.hetong.pojo.HuiKuan;
import com.lzy.hetong.service.HeTongService;
import com.lzy.hetong.vo.HeTongVO;
import com.lzy.hetong.dao.HetongMapper;
import com.lzy.hetong.vo.ReposeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class HeTongServiceImpl implements HeTongService {

    @Autowired
    private HetongMapper hetongMapper;
    @Autowired
    private HuiKuanMapper huiKuanMapper;

    @Override
    public Page<Hetong> selects(HeTongVO hetongVO) {

        Specification<Hetong> specification = new Specification() {
            @Override
            public Predicate toPredicate(Root root, CriteriaQuery criteriaQuery, CriteriaBuilder cb) {

                List<Predicate> list = new ArrayList<>();

                if (hetongVO.getDescs() != null) {
                    Predicate p1 = cb.like(root.get("descs"), "%" + hetongVO.getDescs() + "%");
                    list.add(p1);
                }
                if (hetongVO.getHetong_id() != null) {
                    Predicate p2 = cb.equal(root.get("hetong_id"), hetongVO.getHetong_id());
                    list.add(p2);
                }
                if (hetongVO.getYukuan_price() != null) {
                    Predicate p3 = cb.like(root.get("huikuans_yukuan_price"), "%" + hetongVO.getYukuan_price() + "%");
                    list.add(p3);
                }
                if (hetongVO.getHuikuan_price() != null) {
                    Predicate p4 = cb.like(root.get("huikuans_huikuan_price"), "%" + hetongVO.getHuikuan_price() + "%");
                    list.add(p4);
                }
                if (hetongVO.getCreattime() != null) {
                    Predicate p5 = cb.greaterThanOrEqualTo(root.get("huikuans_yukuan_time"), hetongVO.getCreattime());
                    list.add(p5);
                }
                if (hetongVO.getStopttime() != null) {
                    Predicate p6 = cb.lessThanOrEqualTo(root.get("huikuans_yukuan_time"), hetongVO.getStopttime());
                    list.add(p6);
                }

                Predicate[] predicates = list.toArray(new Predicate[list.size()]);


                return cb.and(predicates);
            }
        };

        Page<Hetong> pages = hetongMapper.findAll(specification, PageRequest.of(hetongVO.getPageNo(), hetongVO.getPageSize()));

        System.out.println(pages);

        return pages;
    }

    @Override
    public List<ReposeVO> list(HeTongVO hetongVO) {

        List<Hetong> hetongs = hetongMapper.findAll();
        List<HuiKuan> huiKuans = huiKuanMapper.findAll();
        List<HuiKuan> huiKuansa = new ArrayList<>();
        List<ReposeVO> list = new ArrayList<>();
        ReposeVO reposeVO = new ReposeVO();
        reposeVO.setHuiKuans(huiKuans);
        for (Hetong hetong : hetongs) {
            reposeVO.setDescs(hetong.getDescs());
            reposeVO.setHetong_id(hetong.getHetong_id());
            reposeVO.setHetong_price(hetong.getHetong_price());
            reposeVO.setUser_id(hetong.getUser_id());
//            for (HuiKuan huikuan : huiKuans) {
//                if (hetong.getHetong_id().equals(huikuan.getHetong_id())) {
//                    huiKuansa.add(huikuan);
//                }
//            }
            list.add(reposeVO);
        }

        return list;
    }

    @Override
    public Boolean deleteAll(String ids) {
        try {
            String[] split = ids.split(",");
            for (int i = 0; i < split.length; i++) {
                huiKuanMapper.deleteById(split[i]);
            }
            return  true;
        }catch (Exception e){
            return false;
        }
    }

}
