package com.FileWriter;

import java.io.FileWriter;

public class Test {
    public static void main(String[]args) throws Exception{
        //创建FileWriter对象
        FileWriter fileWriter = new FileWriter("D:\\IdeaProjects\\IO\\File\\FileWriter.txt");
        //写入
       fileWriter.write("这是一个FileWriter的测试！");
       fileWriter.flush();
       //关闭
        fileWriter.close();
        System.out.println("\n写入完成！");
        }
}
