package com.dyzwj.jvmdemo.demo1;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName StringInternTest2.java
 * @Description TODO
 * @createTime 2020年06月17日 11:06:00
 */
public class StringInternTest2 {

    final static Integer length = 1000 * 10000;

    final static String[] arr = new String[length];

    public static void main(String[] args) throws InterruptedException {

        Integer[] a = new Integer[]{1,2,3,4,5,6,7,8,9,10};
        long start = System.currentTimeMillis();
        for (int i = 0; i < length; i++) {

            arr[i] = new String(String.valueOf(a[length % a.length]));
//            arr[i] = new String(String.valueOf(a[length % a.length])).intern();


        }
        long end = System.currentTimeMillis();
        System.out.println("花费了：" + (end - start));
        Thread.sleep(1000000);
    }

}
