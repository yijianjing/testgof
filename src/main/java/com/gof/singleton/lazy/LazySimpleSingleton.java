package com.gof.singleton.lazy;

/**
 * @author jianjun
 * @version 1.0
 * @date 2021/3/9
 */
public class LazySimpleSingleton {

    private static LazySimpleSingleton lazy = null;

    public LazySimpleSingleton() {

    }

    public static LazySimpleSingleton getInstance() {
        if (lazy == null) {
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }
}
