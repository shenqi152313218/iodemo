package com.company.characterio;


import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * Created by pingheYUshengji on 2020/4/4.
 */
public class $6BufferedWriterDemo {

    public static void main(String[] args) {
        //用缓冲区写入文件
        try(BufferedWriter bufw = new BufferedWriter(new FileWriter("bufWriter.txt"))) {
            bufw.write("abcdefg");
            bufw.newLine();
            bufw.flush();
        } catch (Exception e) {}
    }
}
