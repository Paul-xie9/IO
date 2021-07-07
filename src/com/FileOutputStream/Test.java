package com.FileOutputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test {
    public static void main(String[] args) throws Exception {
        //创建输出流对象
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\IdeaProjects\\IO\\File\\Test01.txt",true); //默认是以覆盖方式写入，如果需要在其后面写入，就需要在（）后面加true
        //写入文件
        fileOutputStream.write(65); //默认是以覆盖方式写入
        fileOutputStream.write('s'); //默认是以覆盖方式写入
        String string  ="\n这是一个测试！";
        fileOutputStream.write(string.getBytes());
        //关闭
        fileOutputStream.close();
        System.out.println("输出结束！");
    }
}
