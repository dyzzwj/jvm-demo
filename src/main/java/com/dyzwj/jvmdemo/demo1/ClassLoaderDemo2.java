package com.dyzwj.jvmdemo.demo1;

import java.net.CacheRequest;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName ClassLoaderDemo2.java
 * @Description TODO
 * @createTime 2020年05月04日 18:02:00
 */
public class ClassLoaderDemo2 {

    private int a = 1;

    public ClassLoaderDemo2(){
        this.a = 2;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public static void main(String[] args) {
        ClassLoaderDemo2 demo2 = new ClassLoaderDemo2();
        System.out.println(demo2.a);
    }
}
