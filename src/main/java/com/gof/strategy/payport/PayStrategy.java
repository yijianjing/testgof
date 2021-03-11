package com.gof.strategy.payport;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jianjun
 * @version 1.0
 * @date 2021/3/11
 */
public class PayStrategy {
    public static final String ALI_PAY = "AliPay";
    public static final String JD_PAY = "JdPay";
    public static final String UNION_PAY = "UnionPay";
    public static final String WECHAT_PAY = "WechatPay";
    public static final String DEFAULT_PAY = ALI_PAY;

    private static Map<String, Payment> paymentMap = new HashMap<String, Payment>();


    static {
        paymentMap.put(ALI_PAY, new AliPay());
        paymentMap.put(JD_PAY, new JDPay());
        paymentMap.put(UNION_PAY, new UnionPay());
        paymentMap.put(WECHAT_PAY, new WechatPay());

    }

    public static Payment getPay(String key) {
        if(!paymentMap.containsKey(key)){
            return paymentMap.get(DEFAULT_PAY);
        }
        return paymentMap.get(key);
    }
}
