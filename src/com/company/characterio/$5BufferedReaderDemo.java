package com.company.characterio;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by pingheYUshengji on 2020/4/4.
 */
public class $5BufferedReaderDemo {

    public static void main(String[] args) {
        //用缓冲区读取文件
        try(BufferedReader bfr = new BufferedReader(new FileReader("catalog"))) {
            String line = null;
            while ((line = bfr.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {}
    }
}
