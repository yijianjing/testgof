package com.gof.decorator.battercake.v2;

import javax.xml.bind.annotation.XmlValue;

/**
 * @author jianjun
 * @version 1.0
 * @date 2021/3/12
 */
public class EggDecorator extends BattercakeDecorator {

    public EggDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getMsg() {
        return super.getMsg()+"1个鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice()+1;
    }
}
