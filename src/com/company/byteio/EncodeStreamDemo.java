package com.company.byteio;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Created by pingheYUshengji on 2020/4/4.
 */
public class EncodeStreamDemo {

    public static void main(String[] args) {
        write();
        read();
    }

    //用uft8写字符到文件
    public static void write() {
        try (OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("codeStreamTest.txt"), "gbk")) {
            osw.write("悠哈");
            osw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //用gbk读取
    //读取结果可能是是？？？
    public static void read() {
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream("codeStreamTest.txt"))) {

            char[] charBuf = new char[1024];
            int num = 0;

            while ((num = isr.read(charBuf)) != -1) {
                System.out.println(new String(charBuf));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
