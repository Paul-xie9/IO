package com.File;

import java.io.File;
import java.io.FileFilter;
import java.util.Date;

/**
 * 1.分隔符
 * 2.文件操作
 * 3。文件夹操作
 */
public class Test {
    public static void main(String[] args) throws Exception{
       // separator();
       // fileOpe();
        directoryOpe();
    }

    //分隔符
    public static void separator() {
        System.out.println("路径分隔符 "+ File.pathSeparator);
        System.out.println("名称分隔符 "+ File.separator);
    }

    //文件操作
    public static void fileOpe() throws Exception{
        //创建文件
        File file = new File("D:\\IdeaProjects\\IO\\File\\File.txt");
        //System.out.println(file.toString());
        if (!file.exists()){
            boolean b = file.createNewFile();
            System.out.println("创建结果："+b);
        }
        //删除文件
        System.out.println("删除结果："+file.delete());  //直接删除

        file.deleteOnExit();
        Thread.sleep(2000); //使用jvm退出时删除

        //获取文件信息
        System.out.println("获取文件的绝对路径："+file.getAbsolutePath());
        System.out.println("获取文件路径："+file.getParent());
        System.out.println("获取文件名称："+file.getName());
        System.out.println("获取文件的长度："+file.length());
        System.out.println("文件创建时间："+new Date(file.lastModified()));

        //判断
        System.out.println("文件是否可写："+file.canWrite());
        System.out.println("文件是否可读："+file.canRead());
        System.out.println("文件是否是文件："+file.isFile());
        System.out.println("文件是否是隐藏："+file.isHidden());
    }

    //文件夹操作
    public static void directoryOpe() throws Exception {
        //创建文件夹
        File dir = new File("D:\\IdeaProjects\\IO\\File01");
        if (!dir.exists()){
            //dir.mkdirs();   //创建多级目录
            System.out.println("文件夹创建结果："+dir.mkdirs());
        }
        //删除目录
        System.out.println("删除结果："+dir.delete());    //直接删除（只能删除空目录）
        dir.deleteOnExit();//使用jvm删除
        Thread.sleep(200);

        //获取文件夹信息
        System.out.println("获取绝对路径:"+dir.getAbsolutePath());
        System.out.println("获取路径:"+dir.getPath());
        System.out.println("获取名称:"+dir.getName());
        System.out.println("获取父目录:"+dir.getParent());
        System.out.println("获取创建时间:"+new Date(dir.lastModified()));

        //判断
        System.out.println("是否是文件夹:"+dir.isDirectory());
        System.out.println("是否是隐藏:"+dir.isHidden());

        //遍历文件夹
        File dir2 = new File("D:\\See_book");    //列出d盘下的文件
        String[] files = dir2.list();
        System.out.println("--------------");
        for (String string:files) {
            System.out.println(string);
        }
        System.out.println("\n---------FileFilter接口的使用----------");
        File[] files1 = dir2.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.getName().endsWith(".txt")){   //筛选出符合.txt的文件
                    return true;
                }
                return false;
            }
        });
        {
            for (File file:files1
                 ) {
                System.out.println(file.getName());
            }
        }
    }
}
