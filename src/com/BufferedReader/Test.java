package com.BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;

public class Test {
    public static void main(String[] args) throws Exception {
        //创建文件读取字符流
        FileReader fileReader = new FileReader("D:\\IdeaProjects\\IO\\File\\Test01.txt");
        //创建缓冲流
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        //读取
        int count = 0;
        while((count = bufferedReader.read()) !=-1){
            System.out.print((char) count);
        }
        //关闭
        bufferedReader.close();
        System.out.println("\n读取完成！");
    }
}
