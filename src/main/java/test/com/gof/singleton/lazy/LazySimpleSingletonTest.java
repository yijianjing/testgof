package test.com.gof.singleton.lazy; 



/** 
* LazySimpleSingleton Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 9, 2021</pre> 
* @version 1.0 
*/ 
public class LazySimpleSingletonTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();
        System.out.println("End");
    }
} 
