package com.OutputStreamWriter;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Test {
    public static void main(String[] args) throws Exception{
        //创建流'
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\IdeaProjects\\IO\\File\\OutputStream.txt");
         OutputStreamWriter objectOutputStream = new OutputStreamWriter(fileOutputStream,"gbk");
         //写入文件
        objectOutputStream.write("这是一个测试！");
        objectOutputStream.flush();
        //关闭
        objectOutputStream.close();
        System.out.println("写入完毕！");
    }
}
