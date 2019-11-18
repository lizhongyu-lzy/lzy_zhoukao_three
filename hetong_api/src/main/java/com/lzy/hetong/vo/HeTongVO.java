package com.lzy.hetong.vo;

import java.math.BigDecimal;
import java.util.Date;

public class HeTongVO {

    //    按合同编号模糊搜索（1分）
    private String hetong_id;
    //    按收款人搜索（2分）
    private String name;
    //    按备注搜索（2分）
    private String descs;
    //    按回款日期开始结束搜索（2分）
    private Date creattime;
    private Date stopttime;
    //    按余款模糊搜索（2分）
    private BigDecimal yukuan_price;
    //    按回款金额搜索（2分）
    private BigDecimal huikuan_price;
    private Integer pageNo;
    private Integer pageSize;

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
    //    按回款综合搜索,如果任意单一项不成功，该项计0（2分）

//    合同编号必须是选择,手写输入计0(2分)



    public void setHetong_id(String hetong_id) {
        this.hetong_id = hetong_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescs() {
        return descs;
    }

    public void setDescs(String descs) {
        this.descs = descs;
    }

    public Date getCreattime() {
        return creattime;
    }

    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }

    public Date getStopttime() {
        return stopttime;
    }

    public void setStopttime(Date stopttime) {
        this.stopttime = stopttime;
    }

    public BigDecimal getYukuan_price() {
        return yukuan_price;
    }

    public String getHetong_id() {
        return hetong_id;
    }

    public void setYukuan_price(BigDecimal yukuan_price) {
        this.yukuan_price = yukuan_price;
    }

    public BigDecimal getHuikuan_price() {
        return huikuan_price;
    }

    public void setHuikuan_price(BigDecimal huikuan_price) {
        this.huikuan_price = huikuan_price;
    }
}
