package com.gof.singleton.register;

/**
 * @author jianjun
 * @version 1.0
 * @date 2021/3/9
 */
public enum EnumSingleton {
    INSTANCE;

    private Object data;
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance(){ return INSTANCE;}
}
