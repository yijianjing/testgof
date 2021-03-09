package com.gof.factory.abstractFactoryTest;

/**
 * @author jianjun
 * @version 1.0
 * @date 2021/3/9
 */
public class HourseTest {
    public static void main(String[] args) {
        IFactory iFactory=new MeiDiFactory();

        iFactory.createRefrigerator().save();
        iFactory.createWashingMachine().save();
    }
}
