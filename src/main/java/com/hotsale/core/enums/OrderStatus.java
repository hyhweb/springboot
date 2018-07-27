package com.hotsale.core.enums;

/**
 * Created by  hyhadmin on 2018/7/25.
 */
public enum  OrderStatus {
    WAIT_FOR_REVIEW("待审核"),
    WAIT_FOR_PAY_ORDER_COST("待支付办单费"),
    ORDER_COMPLETE("办单完成"),
    WAIT_FOR_REVIEW_DELAY_COST("待审核延期申请"),
    WAIT_FOR_PAY_DELAY_COST("待支付延期费"),
    DELAY_COMPLETE("延期成功");

    private String name;

    OrderStatus(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String  getName(int i){
        OrderStatus[] values = OrderStatus.values();
        return i >= 0 && i < values.length ? values[i].getName() : ""+i;
    }

    @Override
    public String toString() {
        return "OrderStatus{" +
                "name='" + name + '\'' +
                '}';
    }
}
