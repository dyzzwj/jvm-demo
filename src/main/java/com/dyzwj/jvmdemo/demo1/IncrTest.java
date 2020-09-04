package com.dyzwj.jvmdemo.demo1;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName IncrTest.java
 * @Description TODO
 * @createTime 2020年05月07日 16:37:00
 */
public class IncrTest {


    public static void main(String[] args) {
        incr();
    }


    /**
     *   0: iinc          0, 20  //自增指令，位于局部变量表中0号位置的int型数值+20   30          null
     *          3: iload_0              //从局部变量表0号位置加载一个int型值到操作数栈      30           30
     *          4: istore_1             //从操作数栈顶出栈一个int型值存到局部变量表1号位置 30，30        null
     *          5: iinc          0, 30  //局部变量表中0号位置的int型数值加30              60，30        null
     *          8: getstatic     #2     //访问类的静态字段值。#2表示静态字段位于运行时     60，30        null
     *         11: iload_0              //从局部变量表0号位置加载一个int型值到操作数栈     60，30         60
     *         12: invokevirtual #3     //调用PrintStream类的实例方法——println输出60     60，30        null
     *         15: iload_1              //从局部变量表1号位置加载一个int型值到操作数栈     60，30        30
     *         16: ireturn              //返回一个int型数值(从栈顶)                      60, 30        null
     *         17: astore_2
     *         18: iinc          0, 30
     *         21: getstatic     #2
     *         24: iload_0
     *         25: invokevirtual #3
     *         28: aload_2
     *         29: athrow
     */

    public static void incr(){
        //第一类问题：
//        int i1 = 10;
//        i1++;
//
//        int i2 = 10;
//        ++i2;

        //第二类问题

        int i3 = 10;
        int i4 = i3++; //10

        int i5 = 10;
        int i6 = ++i5; //11



        //第三类问题
        int i7 = 10;
        i7 = i7++;
        System.out.println(i7); //10

        int i8 = 10;
        i8 = ++i8;
        System.out.println(i8); //11


        //第四类问题
        int i9 = 10;
        int i10 = i9++ + ++i9;




    }
}
