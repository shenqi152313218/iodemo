package com.company.byteio;


import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * Created by pingheYUshengji on 2020/4/4.
 */
//管道流，阻塞
public class PipedStreamDemo {

    public static void main(String[] args) throws Exception {
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();

        pis.connect(pos);

        Thread t1 = new Thread(new Read(pis));
        Thread t2 = new Thread(new Writer(pos));

        t1.start();
        t2.start();
    }

    //读取流
    static class Read implements Runnable {
        private PipedInputStream pipedInputStream;

        Read(PipedInputStream pipedInputStream) {
            this.pipedInputStream = pipedInputStream;
        }
        @Override
        public void run() {
            try {
                byte[] byteBuf = new byte[1024];
                int num = pipedInputStream.read(byteBuf);

                System.out.println(new String(byteBuf, 0, num));

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (pipedInputStream != null) {
                    try {
                        pipedInputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

   static class Writer implements Runnable {
        private PipedOutputStream pipedOutputStream;
        Writer(PipedOutputStream pos) {
            this.pipedOutputStream = pos;
        }
        @Override
        public void run() {
            try {
                Thread.sleep(5000);

                pipedOutputStream.write("haha".getBytes());

                pipedOutputStream.flush();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (pipedOutputStream != null) {
                    try {
                        pipedOutputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
