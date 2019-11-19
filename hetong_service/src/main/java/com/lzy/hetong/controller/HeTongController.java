package com.lzy.hetong.controller;

import com.lzy.hetong.pojo.Hetong;
import com.lzy.hetong.service.HeTongService;
import com.lzy.hetong.vo.HeTongVO;
import com.lzy.hetong.vo.ReposeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("hetong")
public class HeTongController {
    @Autowired
    private HeTongService hetongService;
    @RequestMapping("list")
    public List<ReposeVO> list(HeTongVO hetongVO){
        return  hetongService.list(hetongVO);
    }
    @RequestMapping("deletes")
    public Boolean deletes(String ids){
        return  hetongService.deleteAll(ids);
    }
    @RequestMapping("hello")
    public String Hello(String name){
        return  "hello"+name;
    }
}
