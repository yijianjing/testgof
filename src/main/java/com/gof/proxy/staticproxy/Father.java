package com.gof.proxy.staticproxy;

import com.gof.proxy.Person;

/**
 * @author jianjun
 * @version 1.0
 * @date 2021/3/10
 */
public class Father implements Person {
    private Son son;

    public Father(Son son){
        this.son=son;
    }
    public void findLove() {

        System.out.println("父亲物色对象");
        this.son.findLove();
        System.out.println("双方父母同意，确立关系");
    }
}
