package com.PrintWriter;

import java.io.PrintWriter;

public class Test {
    public static void main(String[] args) throws Exception {
        //创建打印流
        PrintWriter printWriter = new PrintWriter("D:\\IdeaProjects\\IO\\File\\PrintWriter.txt");
        //写入数据
        printWriter.println("这是一个PrintWriter测试！");
        printWriter.println(64);
        printWriter.println(2.7);
        //关闭
        printWriter.close();
        System.out.println("写入完成！");
    }
}
