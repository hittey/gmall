package com.hitty.gmall.enums;

public enum PaymentStatus {
    UNPAID("支付中"),
    PAID("已支付"),
    PAY_FAIL("支付失败"),
    ClOSED("已关闭"),
    REFUND("已退款");

    private String name ;

    PaymentStatus(String name) {
        this.name=name;
    }

}
