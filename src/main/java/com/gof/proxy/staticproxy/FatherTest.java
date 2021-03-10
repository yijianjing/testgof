package com.gof.proxy.staticproxy;

/**
 * @author jianjun
 * @version 1.0
 * @date 2021/3/10
 */
public class FatherTest {
    public static void main(String[] args) {
        Son son=new Son();
        Father father=new Father(son);

        father.findLove();
    }
}
