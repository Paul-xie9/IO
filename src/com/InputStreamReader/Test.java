package com.InputStreamReader;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws Exception{
        //创建一个转换流对象
        FileInputStream fileInputStream = new FileInputStream("D:\\IdeaProjects\\IO\\File\\Test01.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream,"utf8");
        //读取文件
        int count = 0;
        while((count = inputStreamReader.read()) !=-1){
            System.out.print((char) count);
        }
        //关闭
        inputStreamReader.close();
        fileInputStream.close();
        System.out.println("\n读取完毕！");
    }
}
