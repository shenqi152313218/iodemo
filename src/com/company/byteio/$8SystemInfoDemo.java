package com.company.byteio;


import java.io.PrintStream;
import java.util.Properties;

/**
 * Created by pingheYUshengji on 2020/4/4.
 */
public class $8SystemInfoDemo {

    public static void main(String[] args) throws Exception {
        Properties properties = System.getProperties();
//        properties.list(new PrintStream("prop.txt"));
        System.out.print(properties);
    }
}
