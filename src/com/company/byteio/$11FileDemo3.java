package com.company.byteio;


import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by pingheYUshengji on 2020/4/4.
 */
public class $11FileDemo3 {

    public static void main(String[] args) {
        File f = new File("c:");

        File[] files = f.listFiles();
        for(File file : files) {
            System.out.println(file.getName() + "::" + file.length());
        }
//        File f = new File("dir");
//        String[] fnameList = f.list(new FilenameFilter() {
//            @Override
//            public boolean accept(File dir, String name) {
//                return name.endsWith("txt");
//            }
//        });
//        for(String fname : fnameList) {
//            System.out.println(fname);
//        }

//        String[] list = f.list();
//        for(String fname : list) {
//            System.out.println(fname);
//        }

//        File f = new File("dir");
//        String[] list = f.list();
//        for(String fname : list) {
//            System.out.println(fname);
//        }


//        //根目录
//        File f = new File("dir");
//
//        File[] files = f.listRoots();
//
//        for(File lf : files) {
//            System.out.println(lf);
//        }
    }
}
