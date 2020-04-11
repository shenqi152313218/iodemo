package com.company.characterio;

import java.io.FileReader;
import java.io.LineNumberReader;

/**
 * Created by pingheYUshengji on 2020/4/4.
 */
public class $9LineNumberReaderDemo {

    //自定义一个缓冲区类
    public static void main(String[] args) {

        try(LineNumberReader lineNumberReader = new LineNumberReader(new FileReader("catalog"))) {

            lineNumberReader.setLineNumber(100);
            String line = null;

            while ((line = lineNumberReader.readLine()) != null) {
                System.out.println(lineNumberReader.getLineNumber() + ":" + line);
            }

        } catch (Exception e) {}
    }
}
