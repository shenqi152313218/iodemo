package com.company.byteio;


import java.io.*;

/**
 * Created by pingheYUshengji on 2020/4/4.
 */
//可以操作基本数据对象的流
public class DataStreamDemo {

    public static void main(String[] args) throws Exception {

//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("utf.txt"));
//        osw.write("哈哈");
//        osw.flush();
//        osw.close();
        write();
        read();
    }

    //写基本数据类型
    public static void write() {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.txt"))){
            dos.write(1);
            dos.writeBoolean(false);
            dos.writeLong(15);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //读取基本数据类型
    public static void read() {
        try(DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"))) {
            int i = dis.readInt();
            boolean b = dis.readBoolean();
            long s = dis.readLong();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
