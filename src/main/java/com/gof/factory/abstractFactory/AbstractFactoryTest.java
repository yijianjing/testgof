package com.gof.factory.abstractFactory;

/**
 * Created by shinho on 2018/10/18.
 * 三、抽象工厂模式   【优点】：
 * 1、正是由于复杂的抽象关联关系使得在类的内部对一系列产品组的管理很方便
 * <p>
 * 【缺点】：1、扩展很费力，每次要修改很多类。
 * <p>
 * 【应用场景】：待创建的对象是一系列相互关联或相互依赖的产品族时
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        CourseFactory courseFactory=new JavaCourseFactory();

        courseFactory.createNote().edit();
        courseFactory.createVideo().record();

    }
}
