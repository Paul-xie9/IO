package com.FileCopy_FileInputSream_and_FileOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test {
    public static void main(String[] args) throws Exception {
        /**
         * 使用文件字符流实现文件的复制
         */

        //文件输入流
        FileInputStream fileInputStream = new FileInputStream("D:\\IdeaProjects\\IO\\File\\Test01.txt");
        //文件输出流
        FileOutputStream fileOutputStream  = new FileOutputStream("D:\\IdeaProjects\\IO\\File\\Test01_1.txt");

        //一边读一边写
        byte[] bytes = new byte[1024];  //创建缓冲流
        int count = 0;  //记录保存的字节流个数
        while((count = fileInputStream.read(bytes)) != -1){
            fileOutputStream.write(bytes,0,count);  //确保读满
        }

        //关闭流
        fileInputStream.close();
        fileOutputStream.close();
        System.out.println("复制完毕！");
    }
}
