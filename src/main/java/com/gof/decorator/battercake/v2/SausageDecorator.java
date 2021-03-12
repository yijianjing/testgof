package com.gof.decorator.battercake.v2;

/**
 * @author jianjun
 * @version 1.0
 * @date 2021/3/12
 */
public class SausageDecorator extends BattercakeDecorator{
    public SausageDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getMsg() {
        return super.getMsg()+"1个香肠";
    }

    @Override
    protected int getPrice() {
        return super.getPrice()+1;
    }
}
