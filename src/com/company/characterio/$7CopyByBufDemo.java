package com.company.characterio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Created by pingheYUshengji on 2020/4/4.
 */
public class $7CopyByBufDemo {
    //利用缓冲区copy一个文件
    public static void main(String[] args) {
        try(BufferedReader bufr = new BufferedReader(new FileReader("copySourceByBuf"));
            BufferedWriter bufw = new BufferedWriter(new FileWriter("copyTargetByBuf.txt"))
        ) {
            String line = null;
            while ((line = bufr.readLine()) != null) {
                bufw.write(line);
                bufw.newLine();
                bufw.flush();
            }
        } catch (Exception e) {}
    }
}
