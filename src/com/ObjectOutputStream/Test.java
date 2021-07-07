package com.ObjectOutputStream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * 使用ObjectOutputStream实现对象的序列化
 *
 */
public class Test {
    public static void main(String[] args) throws  Exception{
        //创建文件输出流
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\IdeaProjects\\IO\\File\\Student.txt");
        //创建对象输出流
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        //实现序列化，写入操作
        Student student01 = new Student("小明",23);
        //写入对象
        objectOutputStream.writeObject(student01);
        //关闭
        objectOutputStream.close();
        System.out.println("序列化关闭！");
    }
}
