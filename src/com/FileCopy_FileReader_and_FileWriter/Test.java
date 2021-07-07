package com.FileCopy_FileReader_and_FileWriter;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * FileReader和FileWriter进行文件的复制，只能复制文本文件，不能复制其他例如图片，二进制等文件
 */
public class Test {
    public static void main(String[] args) throws Exception{
        //创建读取流
        FileReader fileReader = new FileReader("D:\\IdeaProjects\\IO\\File\\Test01.txt");
        //创建写入流
        FileWriter fileWriter = new FileWriter("D:\\IdeaProjects\\IO\\File\\Test01_2.txt");
        //读写
        int count = 0;
        while((count = fileReader.read()) !=-1){
            fileWriter.write(count);
            fileWriter.flush();
        }
        //关闭
        fileReader.close();
        fileWriter.close();
        System.out.println("复制完毕！");
    }

}
