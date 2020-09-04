package com.dyzwj.jvmdemo.demo1;

import java.util.Date;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName LocalVariablesTest.java
 * @Description 局部变量表
 * @createTime 2020年05月06日 16:54:00
 */
public class LocalVariablesTest {


    private int count;

    public static void main(String[] args) {
        LocalVariablesTest test = new LocalVariablesTest();
        int i = 10;
        Date date = new Date();

    }


    public int methodA(int i){
        //占据两个slot
        double d = 20.0;
        Date date = new Date();
        String str = "xixi";
        return i;
    }


    public void methodB(){

        this.count++;
    }

    public void methodC(){
        int a = 10;
//        {
//            int b;
//            b = a +1;
//        }
        int c = 30;

//        {
//            int d = a + 100;
//        }
        double f;
    }
}
