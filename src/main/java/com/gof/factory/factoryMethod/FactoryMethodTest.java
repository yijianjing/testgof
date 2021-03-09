package com.gof.factory.factoryMethod;

import com.gof.factory.ICourse;

/**
 * Created by shinho on 2018/10/18.
 * 二、工厂模式
 * 【优点】：1、在简单工厂的基础上遵循了开闭原则，又进行了解耦，工厂类分为具体的工厂类
 * <p>
 * 【缺点】：1、每增加一个工厂，就要额外开发一个工厂
 * <p>
 * 【应用场景】：正文中符合工厂模式的情况，多由于解耦
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        ICourseFactory iCourseFactory = new JavaFactory();
        iCourseFactory.create().record();

    }
}
