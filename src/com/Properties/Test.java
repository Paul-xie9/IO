package com.Properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws Exception{
        //创建集合
        Properties properties = new Properties();
        //添加数据
        properties.setProperty("name","小明");
        properties.setProperty("age","18");
        System.out.println(properties.toString());
        System.out.println("----和流有关的方法----");
        //和流有关的方法 list
        PrintWriter printWriter = new PrintWriter("D:\\IdeaProjects\\IO\\File\\Print.txt");
        properties.list(printWriter);
        printWriter.close();

        //store方法 保存
        System.out.println("-------store方法 保存-------");
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\IdeaProjects\\IO\\File\\store.properties");
        properties.store(fileOutputStream,"zhushi");
        fileOutputStream.close();

        //load方法 加载
        Properties properties1 = new Properties();
        FileInputStream fileInputStream = new FileInputStream("D:\\\\IdeaProjects\\\\IO\\\\File\\\\store.properties");
        properties1.load(fileInputStream);
        fileInputStream.close();
        System.out.println(properties1.toString());
    }
}
