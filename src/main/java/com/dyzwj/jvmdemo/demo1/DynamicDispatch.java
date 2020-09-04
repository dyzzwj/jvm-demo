package com.dyzwj.jvmdemo.demo1;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName DynamicDispatch.java
 * @Description TODO
 * @createTime 2020年05月08日 17:36:00
 */
public class DynamicDispatch {

    static abstract class Human {
        protected abstract void sayHello();
    }

    static class Man extends Human {
        @Override
        protected void sayHello() {
            System.out.println("man say hello");
        }
    }

    static class Woman extends Human {
        @Override
        protected void sayHello() {
            System.out.println("woman say hello");
        }
    }

    public static void main(String[] args) {
        Human man = new Man();
        Human woman = new Woman();
        man.sayHello();
        woman.sayHello();
        man = new Woman();
        man.sayHello();
    }
}
