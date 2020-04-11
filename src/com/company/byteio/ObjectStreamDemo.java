package com.company.byteio;


import java.io.*;

/**
 * Created by pingheYUshengji on 2020/4/4.
 */
//操作java对象的流
public class ObjectStreamDemo {
    public static void main(String[] args) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objStream.txt"))) {

            Person p = new Person(1,"zhangsan");
            oos.writeObject(p);
            oos.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objStream.txt"))) {

            Person p = (Person) ois.readObject();

            int age = p.getAge();
            String name = p.getName();
            System.out.println(age + ":" + name);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

class Person implements Serializable{
    private int age;
    private String name;

    public Person() {}

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
