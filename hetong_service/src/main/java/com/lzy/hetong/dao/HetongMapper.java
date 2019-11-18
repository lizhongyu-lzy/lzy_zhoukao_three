package com.lzy.hetong.dao;

import com.lzy.hetong.pojo.Hetong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface HetongMapper extends JpaRepository<Hetong,String>, JpaSpecificationExecutor<Hetong> {

}
