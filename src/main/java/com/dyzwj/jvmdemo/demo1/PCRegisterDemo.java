package com.dyzwj.jvmdemo.demo1;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName PCRegisterDemo.java
 * @Description TODO
 * @createTime 2020年05月05日 17:26:00
 */
public class PCRegisterDemo {



    {
        name = "aa";
    }
    private String name;



    public static void main(String[] args) {

//        int a = 10;
//        int b = 20;
//        int c = a + b;

        try{
            methodB();
            Thread.sleep(1000000);
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("main方法结束");
    }


    public static void methodA(){
        methodB();
        System.out.println(10 / 0);
        System.out.println("methodA执行结束");
    }

    public static void methodB(){
        System.out.println("methodB执行结束");
    }

}
