package com.gof.factory.factoryMethod;

import com.gof.factory.ICourse;
import com.gof.factory.JavaCourse;

/**
 * @author jianjun
 * @version 1.0
 * @date 2021/3/9
 */
public class JavaFactory implements ICourseFactory{
    public ICourse create() {
        return new JavaCourse();
    }
}
