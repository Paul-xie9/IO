package com.BufferedInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Test {
    public static void main(String[] args) throws Exception{
        /**
         * 使用字节输入缓冲流
         */

        //创建输入流
        FileInputStream fileInputStream = new FileInputStream("D:\\IdeaProjects\\IO\\File\\Test01.txt");
        //创建输入缓冲流
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        //读取
        /**
         * 自己也可以创建缓冲区
         * byte[] buf = new byte[1024];
         * int count = 0;
         * while((count = bufferedInputStream.read(buf)) != -1)
         */
        int count = 0;
        while((count = bufferedInputStream.read()) != -1){  //此read默认的缓冲流大小是8192 = 8k
            System.out.print((char) count);
        }
        //关闭
        bufferedInputStream.close();
        System.out.println("\n去读完成！");
    }
}
