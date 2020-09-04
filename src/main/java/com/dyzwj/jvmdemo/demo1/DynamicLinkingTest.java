package com.dyzwj.jvmdemo.demo1;

import org.springframework.cglib.proxy.Enhancer;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName DynamicLinkingTest.java
 * @Description TODO
 * @createTime 2020年05月08日 11:26:00
 */

//动态链接：指向运行时常量池中该栈帧所属方法的引用
public class DynamicLinkingTest {

    public void methodA(){
        try {
            super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println("methodA...");
        methodB();
        methodC();
    }

    public void methodB(){
        System.out.println("methodB...");
    }

    public final void methodC(){
        System.out.println("methodC...");
    }

}
