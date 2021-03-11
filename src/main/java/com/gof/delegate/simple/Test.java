package com.gof.delegate.simple;

/**
 * @author jianjun
 * @version 1.0
 * @date 2021/3/10
 */
public class Test {
    public static void main(String[] args) {
        new Boss().command("b",new Leader());
    }
}
