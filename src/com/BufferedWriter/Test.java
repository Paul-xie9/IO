package com.BufferedWriter;


import java.io.BufferedWriter;
import java.io.FileWriter;

public class Test {
    public static void main(String[] args) throws Exception{
        //创建文件写入字符流
        FileWriter fileWriter = new FileWriter("D:\\IdeaProjects\\IO\\File\\BufferedWriter.txt");
        //创建缓冲区
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        //写入
        bufferedWriter.write("这是一个BufferedWriter的测试！");
        bufferedWriter.flush();
        //关闭
        bufferedWriter.close();
        System.out.println("写入完毕！");
    }
}
