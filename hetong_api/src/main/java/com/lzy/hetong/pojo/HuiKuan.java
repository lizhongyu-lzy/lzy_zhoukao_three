package com.lzy.hetong.pojo;

import javax.persistence.*;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Entity
@Table(name = "t_huikuan")
public class HuiKuan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String hetong_id;
    private BigDecimal hetong_price;
    private BigDecimal yukuan_price;
    private String yukuan_id;
    private Date yukuan_time;

    private BigDecimal huikuan_price;
    private String name;
    private String descs;
    @ManyToOne(targetEntity = Hetong.class)
    @JoinColumn(name = "hetong_id")
    private Hetong hetong;

    public String getHetong_id() {
        return hetong_id;
    }

    public void setHetong_id(String hetong_id) {
        this.hetong_id = hetong_id;
    }

    public String getDescs() {
        return descs;
    }

    public void setDescs(String descs) {
        this.descs = descs;
    }

    public BigDecimal getHetong_price() {
        return hetong_price;
    }

    public void setHetong_price(BigDecimal hetong_price) {
        this.hetong_price = hetong_price;
    }

    public BigDecimal getYukuan_price() {
        return yukuan_price;
    }

    public void setYukuan_price(BigDecimal yukuan_price) {
        this.yukuan_price = yukuan_price;
    }

    public String getYukuan_id() {
        return yukuan_id;
    }

    public void setYukuan_id(String yukuan_id) {
        this.yukuan_id = yukuan_id;
    }

    public Date getYukuan_time() {
        return yukuan_time;
    }

    public void setYukuan_time(Date yukuan_time) {
        this.yukuan_time = yukuan_time;
    }

    public BigDecimal getHuikuan_price() {
        return huikuan_price;
    }

    public void setHuikuan_price(BigDecimal huikuan_price) {
        this.huikuan_price = huikuan_price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hetong getHetong() {
        return hetong;
    }

    public void setHetong(Hetong hetong) {
        this.hetong = hetong;
    }
}
