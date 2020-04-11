package com.company.byteio;


import java.io.FileInputStream;

/**
 * Created by pingheYUshengji on 2020/4/4.
 */
public class $2FileInputStream {
    //字节流
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("catalog")) {
            byte[] buf = new byte[1024];
            int num = 0;
            while ((num = fis.read(buf)) != -1) {
                System.out.println(new String(buf, 0, num));
            }
        } catch (Exception e) {}
    }
}
