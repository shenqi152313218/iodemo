package com.company.characterio;

import java.io.FileReader;
import java.io.IOException;

/**
 * Created by pingheYUshengji on 2020/4/4.
 */
public class $1FileReaderDemo {
    public static void main(String[] args) throws Exception {
        //1、读取文件
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("catalog");
            int ch = 0;
            while ((ch = fileReader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {e.printStackTrace();}
        finally {
            if (fileReader != null) {
                fileReader.close();
            }
        }
    }
}
