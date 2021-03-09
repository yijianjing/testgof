package com.gof.factory.factoryMethod;

import com.gof.factory.ICourse;

/**
 * Created by shinho on 2018/10/18.
 *
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        ICourseFactory iCourseFactory=new JavaFactory();
        ICourse course=iCourseFactory.create();
        course.record();
    }
}
