package com.lzy.hetong.dao;

import com.lzy.hetong.pojo.HuiKuan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface HuiKuanMapper extends JpaRepository<HuiKuan,String>, JpaSpecificationExecutor<HuiKuan> {

    @Modifying
    @Transactional
    @Query("delete from t_huikuan a where a.yukuan_id in (?1)")
    void deleteByIds(List<String> list);

}
