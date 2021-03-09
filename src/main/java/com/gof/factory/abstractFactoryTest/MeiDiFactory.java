package com.gof.factory.abstractFactoryTest;

/**
 * @author jianjun
 * @version 1.0
 * @date 2021/3/9
 */
public class MeiDiFactory implements IFactory {
    public IRefrigerator createRefrigerator() {
        return new MeiDiRefrigerator();
    }

    public IWashingMachine createWashingMachine() {
        return new MeiDiWashingMachine();
    }
}
