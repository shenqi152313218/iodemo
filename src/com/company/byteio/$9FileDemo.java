package com.company.byteio;


import java.io.File;

/**
 * Created by pingheYUshengji on 2020/4/4.
 */
public class $9FileDemo {

    public static void main(String[] args) throws Exception {
        File f = new File("fileWriter.txt");

        System.out.println(f.canExecute());

        System.out.println(f.getCanonicalPath());
        System.out.println(f.getAbsoluteFile());
        System.out.println(f.getPath());
        System.out.println(f.getName());
        System.out.println(f);
    }
}
