package com.company.byteio;


import java.io.InputStream;

/**
 * Created by pingheYUshengji on 2020/4/4.
 */
public class $3SystemIn {

    //键盘录入，over结束
    public static void main(String[] args) {
        try (InputStream in = System.in){
            StringBuffer sb = new StringBuffer();

            int by = 0;
            while (true) {
                char chart = (char) in.read();

                switch (chart) {
                    case '\r':
                        continue;
                    case '\n':
                        String content = sb.toString();
                        if ("over".equalsIgnoreCase(content)) {
                            break;
                        }
                        System.out.println(content);
                        sb.delete(0, sb.length());
                        break;
                    default:
                        sb.append(chart);
                        break;
                }
            }

        } catch (Exception e) {}
    }
}
