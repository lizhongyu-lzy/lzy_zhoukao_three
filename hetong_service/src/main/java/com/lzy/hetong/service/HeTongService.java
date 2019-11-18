package com.lzy.hetong.service;

import com.lzy.hetong.pojo.Hetong;
import com.lzy.hetong.vo.HeTongVO;
import org.springframework.data.domain.Page;

public interface HeTongService {

    Page<Hetong> selects(HeTongVO hetongVO);


}
