package com.gof.factory.abstractFactoryTest;

/**
 * @author jianjun
 * @version 1.0
 * @date 2021/3/9
 * 海尔
 */
public class HaiErFactory implements IFactory{


    public IRefrigerator createRefrigerator() {
        return new HaiErRefrigerator();
    }

    public IWashingMachine createWashingMachine() {
        return new HaiErWashingMachine();
    }
}
