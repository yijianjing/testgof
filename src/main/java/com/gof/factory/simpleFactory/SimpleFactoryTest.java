package com.gof.factory.simpleFactory;

import com.gof.factory.ICourse;
import com.gof.factory.JavaCourse;

/**
 * @author jianjun
 * @version 1.0
 * @date 2021/3/9
 * 一、简单工厂模式 【优点】：
 * 1、客户端创建对象时只需要记住特定的参数，而不需要记住复杂的类名，也不用关注实现的过程。(实现了封装和部分解耦)
 * <p>
 * 2、创建对象不需要单独实例化，而是通过工厂类直接获取示例(实现复用)
 * <p>
 * 【缺点】：1、实例化对象的逻辑全部封装在一个工厂类里，每次需求变化都要单独修改工厂类(违反了开闭原则)，而且出了异常可能没法正常工作。
 * <p>
 * 2、不方便扩展子类
 * 　【应用场景】：适合业务简单或者产品较少的情况
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        ICourse course = SimpleFactory.create(JavaCourse.class);
        course.record();
    }
}
