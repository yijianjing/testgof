package com.gof.strategy;

import com.gof.strategy.payport.MsgResult;
import com.gof.strategy.payport.PayStrategy;
import com.gof.strategy.payport.Payment;

/**
 * @author jianjun
 * @version 1.0
 * @date 2021/3/11
 */
public class Test {
    public static void main(String[] args) {

        final String ALI_PAY = "AliPay";
        final String JD_PAY = "JdPay";
        final String UNION_PAY = "UnionPay";
        final String WECHAT_PAY = "WechatPay";

        //开始支付，选择微信支付、支付宝、银联卡、京东白条、财付通
        //每个渠道它支付的具体算法是不一样的
        //基本算法固定的
        Payment payment = PayStrategy.getPay(ALI_PAY);

        MsgResult mes = payment.pay("1", 1000);
        System.out.println(mes);


    }
}
