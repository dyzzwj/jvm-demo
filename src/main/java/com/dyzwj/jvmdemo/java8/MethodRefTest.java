package com.dyzwj.jvmdemo.java8;

import com.dyzwj.jvmdemo.demo1.IncrTest;
import org.junit.jupiter.api.Test;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName MethodRefTest.java
 * @Description TODO
 * @createTime 2020年05月09日 15:56:00
 */
public class MethodRefTest {


    public static void main(String[] args) {




        Consumer<String> consumer = System.out::println;
        consumer.accept("zwj");

        IncrTest test = new IncrTest();
        IncrTest[] tests = {test};


        ReentrantReadWriteLock rw = new ReentrantReadWriteLock();
        ReentrantReadWriteLock.ReadLock readLock = rw.readLock();
        ReentrantReadWriteLock.WriteLock writeLock = rw.writeLock();

    }

    public static void testCon(Consumer consumer,String s){
        consumer.accept(s);
    }


    public static String testFun(Function<Integer,String> function){

        return function.apply(18);
    }


    public static String aa(Integer integer){
        return integer + "zwj";

    }

    public static String bb(String aa){
        return "11" + aa;
    }





}
