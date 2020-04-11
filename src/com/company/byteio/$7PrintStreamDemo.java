package com.company.byteio;


import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by pingheYUshengji on 2020/4/4.
 */
public class $7PrintStreamDemo {

    public static void main(String[] args) {
        try {
            int i= 1/0;
        } catch (Exception e) {
            try(PrintStream ps = new PrintStream("printStream.txt")) {
                System.setOut(ps);
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:ss:mm");
                String format = sdf.format(new Date());
                ps.println(format);
            } catch (FileNotFoundException e1) {}
        }

    }
}
