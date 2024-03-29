package com.hitty.gmall.bean;

import com.hitty.gmall.enums.OrderStatus;
import com.hitty.gmall.enums.PaymentWay;
import com.hitty.gmall.enums.ProcessStatus;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.security.PrivateKey;
import java.util.Date;
import java.util.List;

@Data
public class OrderInfo implements Serializable {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column
    private String consignee;

    @Column
    private String consigneeTel;


    @Column
    private BigDecimal totalAmount;

    @Column
    private OrderStatus orderStatus;

    @Column
    private ProcessStatus processStatus;

    @Column
    private String userId;

    @Column
    private PaymentWay paymentWay;

    @Column
    private Date expireTime;

    @Column
    private String deliveryAddress;

    @Column
    private String orderComment;

    @Column
    private Date createTime;

    @Column
    private String parentOrderId;

    @Column
    private String trackingNo;


    @Transient
    private List<OrderDetail> orderDetailList;


    @Transient
    private String wareId;

    @Column
    private String outTradeNo;

    public void sumTotalAmount(){
        BigDecimal totalAmount=new BigDecimal("0");
        for (OrderDetail orderDetail : orderDetailList) {
            totalAmount= totalAmount.add(orderDetail.getOrderPrice().multiply(new BigDecimal(orderDetail.getSkuNum())));
        }
        this.totalAmount=  totalAmount;
    }

    public String getTradeBody() {
        OrderDetail orderDetail = orderDetailList.get(0);
        String tradeBody = orderDetail.getSkuName()+"等"+orderDetailList.size()+"件商品";
        return tradeBody;
    }
}
