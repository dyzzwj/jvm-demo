package com.dyzwj.jvmdemo.demo1;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName StackErrorTest.java
 * @Description 虚拟机栈 可能出现的异常：栈溢出 OOM
 *
 * -Xss设置线程的最大栈空间
 * @createTime 2020年05月05日 21:21:00
 */
public class StackErrorTest {

    private static int count = 1;

    public static void main(String[] args) {
        //StackOverFlowException

        System.out.println(count);
        count++;

        main(args);
    }
}
