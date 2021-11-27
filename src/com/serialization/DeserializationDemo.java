package com.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fIn = new FileInputStream("myFile.txt");
            ObjectInputStream in = new ObjectInputStream(fIn);
            Employee employee2 = (Employee)in.readObject();

            System.out.println("Your name is :"+employee2.name);
            System.out.println("Your Department is :"+employee2.department);
            System.out.println("Your Id is "+ employee2.id);
            System.out.println("Your age is "+ employee2.age);
            System.out.println("Yous salary "+employee2.salary);
            System.out.println("Version Id:"+ employee2.serialVersionUUID);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
