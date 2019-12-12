package com.tdsson.enum_type.exer;
/*
1、声明一个枚举类型Payment，
有常量对象银行卡（BankCard）、信用卡（CreditCard）、支付宝（Alipay）、
		微信（Wechat）、虚拟币（VirtualCurrency）、现金（Cash），
声明属性：编号id，描述description，例如：银行卡的编号是1，描述是“银行卡”
声明一个方法，可以根据编号，获取指定枚举对象
public static Payment getPaymentById(int id){
}
重写toString方法：编号：xx，name：常量名，描述：xxx
 */
public enum Payment {
    BANKCARD(1, "银行卡"),
    CREDITCARD(2, "信用卡"),
    ALIPAY(3, "支付宝"),
    WECHAT(4, "微信"),
    VIRTUALCURRENCY(5, "虚拟币"),
    CASH(6, "现金");

    private int id;
    private String description;

    private Payment(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public static Payment getPaymentById(int id) {
        switch (id) {
            case 1:
                return BANKCARD;
            case 2:
                return CREDITCARD;
            case 3:
                return ALIPAY;
            case 4:
                return WECHAT;
            case 5:
                return VIRTUALCURRENCY;
            case 6:
                return CASH;
        }
        return null;
    }

    @Override
    public String toString() {
        return "编号=" + id +",name="+ name()   +", description=" + description;
    }
}
