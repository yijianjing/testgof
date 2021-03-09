package com.gof.factory.factoryMethod;

import com.gof.factory.ICourse;
import com.gof.factory.PythonCourse;

/**
 * @author jianjun
 * @version 1.0
 * @date 2021/3/9
 */
public class PythonFactory implements ICourseFactory{
    public ICourse create(){
        return new PythonCourse();
    }
}
