package com.company.byteio;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Created by pingheYUshengji on 2020/4/4.
 */
public class $4TransStreamDemo {

    //键盘录入，控制台输出，转换流
    public static void main(String[] args) {
//        try(BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
//            BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out))) {
//            String line = null;
//            while ((line = bfr.readLine()) != null) {
//                bfw.write(line);
//                bfw.newLine();
//                bfw.flush();
//            }
//        } catch (Exception e) {}

        try(BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String line = null;
            while ((line = bfr.readLine()) != null) {
                if ("over".equalsIgnoreCase(line)) {
                    break;
                }
                bfw.write(line);
                bfw.newLine();
                bfw.flush();
            }
        } catch (Exception e) {}
    }
}
