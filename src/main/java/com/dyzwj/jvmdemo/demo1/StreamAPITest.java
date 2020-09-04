package com.dyzwj.jvmdemo.demo1;

import java.util.Arrays;
import java.util.List;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName StreamAPITest.java
 * @Description TODO
 * @createTime 2020年05月09日 23:33:00
 */
public class StreamAPITest {

    public static void main(String[] args) {

//        String[] arr = {"Hello","World"};
//        Arrays.stream(arr).map(x -> x.split("")).forEach(System.out::println);

        List<String> list = Arrays.asList("aa", "bb", "cc", "dd");
        list.stream().map(x -> x.toUpperCase()).forEach(System.out::println);

        System.out.println();


        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer reduce = integerList.stream().reduce(0, Integer::sum);
        System.out.println(reduce);


    }
}
