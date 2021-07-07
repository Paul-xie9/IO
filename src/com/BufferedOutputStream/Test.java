package com.BufferedOutputStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class Test {
    public static void main(String[] args) throws Exception{
        /**
         * 字节输出缓冲流
         */

        //创建输出
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\IdeaProjects\\IO\\File\\Test02.txt");
        //创建输出缓冲流
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);


        //写入文件
        for (int i = 0; i < 10; i++) {
            bufferedOutputStream.write("Cecucess!\r\n".getBytes(StandardCharsets.UTF_8));   //写入8k的缓冲区
            bufferedOutputStream.flush();   //需要刷新缓冲区，文件才能到硬盘中去
        }
        //关闭 其内部会调用flush（）
        bufferedOutputStream.close();

        System.out.println("输入完毕！");
    }
}
