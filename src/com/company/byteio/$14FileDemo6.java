package com.company.byteio;

import java.io.File;

/**
 * Created by pingheYUshengji on 2020/4/4.
 */
//java 文件列表
public class $14FileDemo6 {

    public static void main(String[] args) {
        String set = (String) null;

        System.out.println(set);
        System.out.println("null".equals(set));

        System.out.println(set == null);
        //delDir(new File("dir"));
        System.out.println("over");
    }

    public static void delDir(File delFile) {
        File[] fileList = delFile.listFiles();
        for(File f : fileList) {
            if (f.isDirectory()) {
                delDir(f);
            } else {
                f.delete();
            }
        }
    }
}
