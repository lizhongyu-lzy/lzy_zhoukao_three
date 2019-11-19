package com.lzy.hetong.pojo;

import javax.persistence.*;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "t_huikuan")
public class HuiKuan {
    private BigDecimal hetong_price;
    private BigDecimal yukuan_price;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String yukuan_id;
    private Date yukuan_time;

    private BigDecimal huikuan_price;
    private String name;
    private String descs;

    @ManyToOne
    private Hetong hetong;

    @Override
    public String toString() {
        return "HuiKuan{" +
                "hetong_price=" + hetong_price +
                ", yukuan_price=" + yukuan_price +
                ", yukuan_id='" + yukuan_id + '\'' +
                ", yukuan_time=" + yukuan_time +
                ", huikuan_price=" + huikuan_price +
                ", name='" + name + '\'' +
                ", descs='" + descs + '\'' +
                ", hetong=" + hetong +
                '}';
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

    public String getDescs() {
        return descs;
    }

    public void setDescs(String descs) {
        this.descs = descs;
    }

    public Hetong getHetong() {
        return hetong;
    }

    public void setHetong(Hetong hetong) {
        this.hetong = hetong;
    }
}
