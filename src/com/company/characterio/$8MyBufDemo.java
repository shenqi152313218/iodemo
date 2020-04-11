package com.company.characterio;

import java.io.*;

/**
 * Created by pingheYUshengji on 2020/4/4.
 */
public class $8MyBufDemo implements AutoCloseable {

    //自定义一个缓冲区类
    private Reader reader;

    $8MyBufDemo(Reader r) {
        this.reader= r;
    }

    public String readLine() throws IOException {
        StringBuffer sb = new StringBuffer();
        int ch = 0;
        while ((ch = reader.read()) != -1) {
            char chart = (char) ch;
            switch (chart) {
                case '\n':
                    continue;
                case  '\r':
                    return sb.toString();
                default:
                    sb.append(chart);
                    break;
            }
        }

        if (sb.length() != 0) {
            return sb.toString();
        }

        return null;
    }

    public void close() throws IOException {
        reader.close();
    }

    //自定义一个缓冲区类
    public static void main(String[] args) {

        try($8MyBufDemo mybuf = new $8MyBufDemo(new FileReader("catalog"))) {
            String line = null;

            while ((line = mybuf.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

//        String s = new StringBuffer().toString();
//        System.out.println("");
    }
}
