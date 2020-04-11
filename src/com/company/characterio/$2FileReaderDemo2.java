package com.company.characterio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by pingheYUshengji on 2020/4/4.
 */
public class $2FileReaderDemo2 {
    public static void main(String[] args) {
        //2、定义字符缓冲区读取文件
        FileReader fr = null;
        try {
            fr = new FileReader("catalog");
            int num = 0;
            char[] charBuf = new char[1024];
            while ((num = fr.read(charBuf)) != -1) {
                System.out.print(new String(charBuf, 0, num));
            }
        } catch (IOException e) {} finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {/*异常：流关闭失败*/}
            }
        }

        //对比字节流定义byte缓冲区读取文件
//        try(FileInputStream fis = new FileInputStream("catalog")) {
//            byte[] byteBuf = new byte[1024];
//            int num = 0;
//            while ((num = fis.read(byteBuf)) != -1) {
//                System.out.print(new String(byteBuf, 0, num));
//            }
//        } catch (Exception e) {}
    }
}
