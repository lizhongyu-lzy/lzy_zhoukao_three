package com.lzy.hetong.pojo;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "t_hetong")
public class Hetong {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String hetong_id;
    private String user_id;
    private BigDecimal hetong_price;
    private String descs;


    @OneToMany(mappedBy = "hetong",cascade = CascadeType.ALL)
    private List<HuiKuan> huiKuans;


    public String getHetong_id() {
        return hetong_id;
    }

    public void setHetong_id(String hetong_id) {
        this.hetong_id = hetong_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public BigDecimal getHetong_price() {
        return hetong_price;
    }

    public void setHetong_price(BigDecimal hetong_price) {
        this.hetong_price = hetong_price;
    }

    public String getDescs() {
        return descs;
    }

    public void setDescs(String descs) {
        this.descs = descs;
    }

//    public List<HuiKuan> getHuikuans() {
//        return huikuans;
//    }
//
//    public void setHuikuans(List<HuiKuan> huikuans) {
//        this.huikuans = huikuans;
//    }
}
