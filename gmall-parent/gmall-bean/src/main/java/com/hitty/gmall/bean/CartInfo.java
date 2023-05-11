package com.hitty.gmall.bean;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class CartInfo implements Serializable {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column
    private String skuId;
    @Column
    private String userId;
    @Column
    private String imgUrl;
    @Column
    private String skuName;
    @Column
    private BigDecimal cartPrice;
    @Column
    private Integer skuNum;
    @Transient
    private BigDecimal skuPrice;
    @Transient
    private String isCheck="0";

}
