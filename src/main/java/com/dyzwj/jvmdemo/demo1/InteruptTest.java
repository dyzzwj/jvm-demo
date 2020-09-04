package com.dyzwj.jvmdemo.demo1;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName InteruptTest.java
 * @Description TODO
 * @createTime 2020年05月15日 21:51:00
 */
public class InteruptTest {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {


            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("t1被Interrupte");
            }

            System.out.println("t1执行完毕...");
        });
        t1.start();
        Thread.sleep(1000);
        t1.interrupt();
        System.out.println("interrupt");

    }
}
