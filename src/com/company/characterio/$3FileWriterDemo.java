package com.company.characterio;

import java.io.FileWriter;

/**
 * Created by pingheYUshengji on 2020/4/4.
 */
public class $3FileWriterDemo {
    public static void main(String[] args) {
        //3、创建一个文件，并且写入一些数据
        FileWriter fw = null;
        try {
            //文件存在会被覆盖
            fw = new FileWriter("fileWriter.txt");

            fw.write("abcde");
            fw.flush();
        } catch (Exception e) {}
        finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (Exception e) {}
            }
        }

        //续写
        FileWriter fwAppend = null;
        try {
            //文件存在会被覆盖
            fwAppend = new FileWriter("fileWriter.txt", true);

            fwAppend.write("fghijk");
            fwAppend.flush();
        } catch (Exception e) {}
        finally {
            if (fwAppend != null) {
                try {
                    fwAppend.close();
                } catch (Exception e) {}
            }
        }
    }
}
