package com.FileInputStream;

import java.io.FileInputStream;


public class Test {
    public static void main(String[] args) throws Exception {
        //创建对象，并指定文件位置
        FileInputStream fileInputStream = new FileInputStream("D:\\IdeaProjects\\IO\\File\\Test01.txt");
        //读取文件
        /*按字节读取*/
/*        int data = 0;
        while((data = fileInputStream.read()) != -1){

            System.out.println((data));
        }
*/
        /* 按固定字节读取 */
        byte[]  buf = new byte[1024];
        int count = 0;
        while((count = fileInputStream.read()) != -1){
            System.out.print(new String(buf,0,count));
        }
        //关闭
        fileInputStream.close();
        System.out.println("读取完毕！");

    }
}
