package com.gof.adapter.poweradapter;

/**
 * @author jianjun
 * @version 1.0
 * @date 2021/3/11
 */
public class PowerAdapter implements DC5 {

    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    public int outoupDC5V() {
        int input = ac220.outputAC220V();
        int out = input / 44;
        System.out.println("使用PowerAdapter输入AC:" + input + "V,输出DC：" + out + "V");
        return out;
    }
}
