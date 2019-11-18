package com.lzy.hetong.controller;

import com.lzy.hetong.pojo.Hetong;
import com.lzy.hetong.service.HeTongService;
import com.lzy.hetong.vo.HeTongVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("hetong")
public class HeTongController {
    @Autowired
    private HeTongService hetongService;
    @RequestMapping("list")
    public Page<Hetong> list(HeTongVO hetongVO){
        return  hetongService.selects(hetongVO);
    }
}
