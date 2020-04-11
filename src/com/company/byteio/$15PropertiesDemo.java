package com.company.byteio;


import java.io.*;
import java.util.Enumeration;
import java.util.Properties;

/**
 * Created by pingheYUshengji on 2020/4/4.
 */
//Properties 类
public class $15PropertiesDemo {

    public static void main(String[] args) {
//        prop1();
//        prop2();
        prop3();
    }

    public static void prop3() {
        //从流中读取配置放在prop中
        try(BufferedReader bfr = new BufferedReader(new InputStreamReader(new FileInputStream("prop.txt")));
            BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("prop_write.txt")))
        ) {
            Properties prop = new Properties();
            prop.load(bfr);

            prop.setProperty("zhangsan", "22");
            prop.store(bfw, "store");

        } catch (Exception e) {
            e.printStackTrace();
        }
        //将prop中的配置写入文件中
    }

    //从流中读取配置
    public static void prop2() {
        try (BufferedReader bfr = new BufferedReader(new InputStreamReader(new FileInputStream("prop.txt")))) {
            Properties prop = new Properties();

            String line = null;
            while ((line = bfr.readLine()) != null) {
                String[] split = line.split("=");

                prop.setProperty(split[0], split[1]);
            }

            System.out.println(prop);

            prop.list(System.out);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void prop1() {
        Properties prop = new Properties();

        prop.setProperty("zhangsan", "20");
        prop.setProperty("lisi", "30");

        Enumeration pNameEnum = prop.propertyNames();

        while (pNameEnum.hasMoreElements()) {
            String pName =(String) pNameEnum.nextElement();
            String pValue =(String) prop.get(pName);
            System.out.println(pName + "=" + pValue);
        }

    }
}
