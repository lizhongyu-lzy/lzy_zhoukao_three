package com.lzy.hetong.service;

import com.lzy.hetong.pojo.Hetong;
import com.lzy.hetong.vo.HeTongVO;
import com.lzy.hetong.vo.ReposeVO;
import org.springframework.data.domain.Page;

import java.util.List;

public interface HeTongService {

    Page<Hetong> selects(HeTongVO hetongVO);

    List<ReposeVO> list(HeTongVO hetongVO);

    Boolean deleteAll(String ids);
}
