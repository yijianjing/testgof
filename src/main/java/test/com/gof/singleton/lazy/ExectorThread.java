package test.com.gof.singleton.lazy;

import com.gof.singleton.lazy.LazyDoubleCheckSingleton;
import com.gof.singleton.lazy.LazyInnerClassSingleton;
import com.gof.singleton.lazy.LazySimpleSingleton;
import com.gof.singleton.threadlocal.ThreadLocalSingleton;

/**
 * Created by Tom.
 */
public class ExectorThread implements Runnable{

    public void run() {
        ThreadLocalSingleton singleton = ThreadLocalSingleton.getInstance();
//        ThreadLocalSingleton singleton = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + singleton);
    }
}
