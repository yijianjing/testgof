package com.gof.singleton.hungry;

/**
 * @author jianjun
 * @version 1.0
 * @date 2021/3/9
 */
public class HungryStaticSingleton {
    private HungryStaticSingleton() {
    }

    private static final HungryStaticSingleton hungrySingleton;

    static {
        hungrySingleton = new HungryStaticSingleton();
}

    public static HungryStaticSingleton getInstance() {
        return hungrySingleton;
    }
}
