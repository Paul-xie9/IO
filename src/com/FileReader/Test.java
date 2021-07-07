package com.FileReader;

import java.io.FileReader;

public class Test {
    public static void main(String[] args) throws Exception{
        //创建文件字符流
        FileReader fileReader = new FileReader("D:\\IdeaProjects\\IO\\File\\Test01.txt");
        //读取
        /*单个字符读取*/
/*        int count = 0;
        while((count = fileReader.read()) != -1){   //单个字符读取
            System.out.print((char) count);
        }
*/

        /* 多个字符读取 */
        char[] buf = new char[1024];
        int count = 0;
        while((count = fileReader.read(buf)) != -1){
            System.out.print(new String(buf,0,count));
        }

        //关闭
        fileReader.close();
        System.out.println("\n\n读取完成！");
    }
}
