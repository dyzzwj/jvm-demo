package com.dyzwj.jvmdemo.demo1;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName VirtualMethodTest.java
 * @Description TODO
 * @createTime 2020年05月08日 12:08:00
 */
public class VirtualMethodTest {








}

class Father{


    public Father(){
        System.out.println("Father的构造器");
    }


    public static void showStatic(String string){
        System.out.println("father "+string);
    }

    public final void showFinal(){
        System.out.println("father showFinal");
    }

    public void showCommon(){
        System.out.println("father showCommon");
    }

}


class Son extends Father{


    public Son(){
        super();
    }

    public Son(int age){
        this();
    }

    public static void showStatic(String string){
        System.out.println("son "+string);
    }

    private void showPrivate(){

        System.out.println("son showPrivate");
    }

    public void show(){

        //invokestatic
        showStatic("zhengwenjie");
        //invokestatic
        super.showStatic("dengyizhuo");
        // invokespecial
        showPrivate();
        // invokespecial
        super.showCommon();
        // invokespecial
        super.showFinal();
        // invokevirtual
        showFinal();
        // invokespecial
        super.showCommon();
        // invokevirtual
        showCommon();

    }


}




