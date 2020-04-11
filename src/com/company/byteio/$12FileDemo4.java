package com.company.byteio;

import java.io.File;

/**
 * Created by pingheYUshengji on 2020/4/4.
 */
public class $12FileDemo4 {

    //递归
    public static void main(String[] args) {
//        toBin(6);
//        System.out.println("over");
        showDir(new File("dir"), 1);
    }

    public static void showDir(File file, int level) {
        System.out.println(getLevel(level) + file.getName());

        File[] files = file.listFiles();
        level ++;
        for (File f : files) {
            if (f.isDirectory()) {
                showDir(f, level);
            } else {
                System.out.println(getLevel(level) + f.getName());
            }
        }
    }

    //打印一个文件夹
    public static String getLevel(int x) {
        StringBuffer sb = new StringBuffer();
        sb.append("|--");

        for (int i = 1; i < x; i++) {
            sb.append("|--");
        }
        return sb.toString();
    }

    //转换二进制
    public static void toBin(int x) {
//        while (x > 0) {
//            System.out.println(x % 2);
//            x = x / 2;
//        }

        if (x > 0) {
            toBin(x / 2);
            System.out.println(x % 2);
        }
    }

    //求和
    public static int getSum(int i) {
        if (i == 1) {
            return 1;
        }

        return i + getSum(i - 1);
    }
}
