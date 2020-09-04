package com.dyzwj.jvmdemo.demo2;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName Singleton.java
 * @Description TODO
 * @createTime 2020年05月17日 21:55:00
 */
public class Singleton {


    private Singleton(){}

    private static volatile Singleton instance = null;


    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }


    public static Singleton getInstance1(){
        synchronized (Singleton.class){
            if(instance == null){
                instance = new Singleton();
            }
            return instance;
        }
    }


    /**
     * @title
     * @description 第一次调用getInstance2()才会进入同步代码块（第一次调用时创建对象），
     * 后续调用getInstance2（）无需进入同步代码块
     * @author zhengwenjie
     * @updateTime 2020-05-17 22:07
     * @throws
     */
    public static Singleton getInstance2(){

        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }







    }
