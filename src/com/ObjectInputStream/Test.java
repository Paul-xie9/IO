package com.ObjectInputStream;

import com.ObjectOutputStream.Student;

import java.io.FileInputStream;

import java.io.ObjectInputStream;

/**
 * 注意事项：
 * 1.序列化的的对象需要用Serilalizable接口
 * 2，序列化对象里面的属性也需要实现Serilalizable接口
 * 3.序列化的版本号ID，保证序列化的类和反序列化的类是同一个类
 * 4.使用transient修饰属性，这个属性不能序列化。
 * 5.静态属性不能序列化
 * 6.序列化多个对象的时候可以借助集合来实现
 */

public class Test {
    public static void main(String[] args) throws Exception {
        //创建对象流
        FileInputStream fileInputStream = new FileInputStream("D:\\IdeaProjects\\IO\\File\\Student.txt");
        //创建对象输出流
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        //读取文件,反序列化
       Student student = (Student) objectInputStream.readObject();
        //关闭
        objectInputStream.close();
        System.out.println("反序列化完毕！");
        System.out.println(student.toString());
    }
}
