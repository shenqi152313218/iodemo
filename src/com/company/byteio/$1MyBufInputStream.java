package com.company.byteio;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by pingheYUshengji on 2020/4/4.
 */
public class $1MyBufInputStream implements AutoCloseable {
    //缓冲的方式读取
    private InputStream inputStream;

    private byte[] byteBuf = new byte[1024];

    private int count = 0;
    private int pos = 0;

    public static void main(String[] args) throws Exception {

        try($1MyBufInputStream bis
                    = new $1MyBufInputStream(new FileInputStream("catalog"));
            FileOutputStream fis = new FileOutputStream("catalog copy")) {
            int byt = 0;
            while ((byt = bis.read()) !=-1) {
                fis.write(byt);
                fis.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private int read() throws IOException {
        if (count == 0) {
            count = inputStream.read(byteBuf);
            pos = 0;
            if (count != -1) {
                count --;
                return byteBuf[pos++] & 255;
            }
            return -1;
        } else if (count > 0) {
            count --;
            return byteBuf[pos++] & 255;
        }

        return -1;
    }

    $1MyBufInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public void close() throws Exception {
        inputStream.close();
    }
}
