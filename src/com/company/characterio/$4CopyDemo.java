package com.company.characterio;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * Created by pingheYUshengji on 2020/4/4.
 */
public class $4CopyDemo {

    //复制
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        try(FileReader fr = new FileReader("copySource");
            FileWriter fw = new FileWriter("copyTarget")
        ) {
            char[] charBuf = new char[1024];
            int num = 0;
            while ((num = fr.read(charBuf)) != -1) {
                fw.write(new String(charBuf, 0, num));
                fw.flush();
            }
        } catch (Exception e) {}

        System.out.println(System.currentTimeMillis() - start);
    }
}
