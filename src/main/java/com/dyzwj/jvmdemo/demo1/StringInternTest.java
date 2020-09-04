package com.dyzwj.jvmdemo.demo1;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName StringInternTest.java
 * @Description TODO
 * @createTime 2020年06月15日 16:46:00
 */
public class StringInternTest {

    public static void main(String[] args) {
        System.out.println(System.getProperty("java.version"));

        String s1 = new String("ab");
        s1.intern();
        String s2 = "ab";
        System.out.println(s1 == s2);

        String s3 = new String("1") + new String("1");
        s3.intern();
        String s4 = "11";
        System.out.println(s3 == s4);
    }
}
