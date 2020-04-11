package com.company.byteio;


import java.io.RandomAccessFile;

/**
 * Created by pingheYUshengji on 2020/4/4.
 */
//随机读取文件
public class RandomAccessFileDemo {

    public static void main(String[] args) throws Exception {

//        write();
        read();
    }

    //写入李四、97；王五、99两个数据
    public static void write() {

        try (RandomAccessFile raf = new RandomAccessFile("randomAccessFile.txt", "rw")) {
            raf.write("李四".getBytes());//6个字节
            raf.writeInt(97);//4个字节

            raf.write("王五".getBytes());
            raf.writeInt(99);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //只读取王五的数据
    public static void read() {

        try (RandomAccessFile raf = new RandomAccessFile("randomAccessFile.txt", "r")) {
//            raf.seek(10);
            raf.skipBytes(10);

            byte[] byteBuf = new byte[6];
            int num = raf.read(byteBuf);
            System.out.println(new String(byteBuf));

            int age = raf.readInt();
            System.out.println(age);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
