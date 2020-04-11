package com.company.byteio;

import javafx.collections.transformation.FilteredList;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by pingheYUshengji on 2020/4/4.
 */
//java 文件列表
public class $13FileDemo5 {

    public static void main(String[] args) {
        List<File> fileList = new ArrayList<>();

        listFile(new File("dir"), fileList);
        writeFile(fileList, "recursionTxtName");
    }

    public static void listFile(File f, List<File> fileList) {
        File[] files = f.listFiles();

        for (File file : files) {
            if (f.isDirectory()) {
                listFile(file, fileList);
            } else {
                if (f.getName().endsWith(".txt")) {
                    fileList.add(file);
                }
            }
        }
    }

    public static void writeFile(List<File> fileList, String writeFileName) {

        try(BufferedWriter bufw = new BufferedWriter(new FileWriter(writeFileName))) {

            for (File f : fileList) {
                bufw.write(f.getAbsolutePath());
                bufw.newLine();
                bufw.flush();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
