package com.dyzwj.jvmdemo.demo1;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName ClassLoaderDemo1.java
 * @Description TODO
 * @createTime 2020年05月04日 10:55:00
 */
public class ClassLoaderDemo1 {


    //包含关系：引导类加载器>扩展类加载器>系统类加载器>自定义类加载器


    public static void main(String[] args) {
        //获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);//sun.misc.Launcher$AppClassLoader@18b4aac2

        //获取其上层，扩展类加载器
        ClassLoader extClassLoader = systemClassLoader.getParent();
        System.out.println(extClassLoader);//sun.misc.Launcher$ExtClassLoader@24d46ca6

        //获取其上层：获取不到引导类加载器
        ClassLoader bootstrapClassLoader = extClassLoader.getParent();
        System.out.println(bootstrapClassLoader);//null

        //用户自定义类：默认使用系统类加载器进行加载
        ClassLoader classLoader = ClassLoaderDemo1.class.getClassLoader();
        System.out.println(classLoader);//sun.misc.Launcher$AppClassLoader@18b4aac2

        //对于Java核心类库，使用引导类加载器进行加载
        ClassLoader stringClassLoader = String.class.getClassLoader();
        System.out.println(stringClassLoader);//null

    }


}
