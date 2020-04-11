package com.company.byteio;


import java.io.File;

/**
 * Created by pingheYUshengji on 2020/4/4.
 */
public class $10FileDemo2 {

    public static void main(String[] args) throws Exception {
//        File f = new File("catalog");
//        boolean absolute = f.isAbsolute();
//        boolean directory = f.isDirectory();
//        boolean file = f.isFile();
//        System.out.println(f.getAbsolutePath());
//        System.out.println(f.getParent());
//
//        System.out.println("");

        File dir = new File(".\\dir");
        boolean mkdir = dir.mkdirs();

        System.out.println("");
    }
}
