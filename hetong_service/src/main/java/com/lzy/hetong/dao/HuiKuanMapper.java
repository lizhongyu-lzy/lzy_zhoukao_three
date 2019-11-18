package com.lzy.hetong.dao;

import com.lzy.hetong.pojo.HuiKuan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface HuiKuanMapper extends JpaRepository<HuiKuan,String>, JpaSpecificationExecutor<HuiKuan> {

}
