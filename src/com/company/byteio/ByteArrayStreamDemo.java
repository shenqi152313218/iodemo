package com.company.byteio;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * Created by pingheYUshengji on 2020/4/4.
 */
//字节数组流对象，比较常用
public class ByteArrayStreamDemo {

    public static void main(String[] args) throws Exception {
        try (ByteArrayInputStream bis = new ByteArrayInputStream("你好".getBytes());
             ByteArrayOutputStream bos = new ByteArrayOutputStream()
        ) {

            int by = 0;
            while ((by = bis.read()) != -1) {
                bos.write(by);
            }

            System.out.println(bos.size());
            System.out.println(bos.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
