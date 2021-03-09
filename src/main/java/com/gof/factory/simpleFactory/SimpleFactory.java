package com.gof.factory.simpleFactory;

import com.gof.factory.ICourse;
import com.gof.factory.JavaCourse;

/**
 * Created by shinho on 2018/10/18.
 */
public class SimpleFactory {
   public static ICourse create(Class clz)  {
       try {
           return (ICourse)clz.newInstance();
       } catch (InstantiationException e) {
           e.printStackTrace();
           return null;
       } catch (IllegalAccessException e) {
           e.printStackTrace();
           return null;
       }
   }
}
