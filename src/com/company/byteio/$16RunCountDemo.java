package com.company.byteio;


import java.io.*;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Vector;

/**
 * Created by pingheYUshengji on 2020/4/4.
 */
//计数器，运行5次提示
public class $16RunCountDemo {

    public static void main(String[] args) throws Exception {
//        sequence();
        //        split();
//        sequenceStream();
        File file = new File("runcount.txt");

        try(BufferedReader bfr = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
            Properties prop = new Properties();
            prop.load(bfr);
            //读取配置文件
            String times = prop.getProperty("times");
            if (times == null) {
                throw new Exception();
            }
            Integer runCount = Integer.valueOf(times);
            //次数+1
            runCount++;
            //是否大于5
            if (runCount > 5) {
                System.out.println("使用期已过");
                return;
            }

            try(BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)))) {
                prop.setProperty("times", runCount + "");
                prop.store(bfw, "runCount");
            } catch (FileNotFoundException e) {}

        } catch (Exception e) {
            e.printStackTrace();
        }

    }



    public static void split() {
        try(FileInputStream fis = new FileInputStream("heart.png")) {
            byte[] byteBuf = new byte[1024*100];
            int num = 0;

            int i = 0;
            while ((num = fis.read(byteBuf)) != -1) {
                try(FileOutputStream fos = new FileOutputStream("heart_split" + i + ".png")) {
                    fos.write(byteBuf, 0, num);
                    fos.flush();
                    i ++;
                } catch (FileNotFoundException e) {}
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void sequence() throws Exception {
        //合并流
        Vector<FileInputStream> fis = new Vector<FileInputStream>();
        fis.add(new FileInputStream("heart_split0.png"));
        fis.add(new FileInputStream("heart_split1.png"));
        fis.add(new FileInputStream("heart_split2.png"));
        fis.add(new FileInputStream("heart_split3.png"));
        fis.add(new FileInputStream("heart_split4.png"));


        try(SequenceInputStream sis = new SequenceInputStream(fis.elements());
            FileOutputStream fos = new FileOutputStream("heart_sis.png")
        ) {
            byte[] byteBuf = new byte[1024];
            int num = 0;

            while ((num = sis.read(byteBuf)) != -1) {
                fos.write(byteBuf, 0, num);
                fos.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void sequenceStream() throws Exception {
        //list 文件读取流
        Vector<FileInputStream> fisVec = new Vector<>();
        fisVec.add(new FileInputStream("1.txt"));
        fisVec.add(new FileInputStream("2.txt"));
        fisVec.add(new FileInputStream("3.txt"));
        //new sequenceString

        Enumeration<FileInputStream> elements = fisVec.elements();
        try (SequenceInputStream sis = new SequenceInputStream(elements);
            FileOutputStream fileOutputStream = new FileOutputStream("4.txt")
        ) {
            byte[] byteBuf = new byte[1024];
            int num = 0;
            while ((num = sis.read(byteBuf)) != -1) {
                fileOutputStream.write(byteBuf, 0, num);
                fileOutputStream.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
