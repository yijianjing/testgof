package com.gof.factory.abstractFactoryTest;

/**
 * @author jianjun
 * @version 1.0
 * @date 2021/3/9
 */
public interface IFactory {
    /**
     * 电冰箱
     */
    IRefrigerator createRefrigerator();
    /**
     * 洗衣机
     */
    IWashingMachine createWashingMachine();
}
