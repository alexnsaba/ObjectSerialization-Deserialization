package com.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerializationDemo {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            Employee employee = new Employee();
            System.out.println("Enter Your name");
            employee.name = scanner.next();

            System.out.println("Enter Your department");
            employee.department = scanner.next();

            System.out.println("Enter Your id");
            employee.id = scanner.nextInt();

            System.out.println("Enter Your age");
            employee.age = scanner.nextInt();

            System.out.println("Enter Your Salary");
            employee.salary = scanner.nextDouble();

            FileOutputStream fOut = new FileOutputStream("myFile.txt");
            ObjectOutputStream out = new ObjectOutputStream(fOut);
            out.writeObject(employee);
            out.flush();
            out.close();
            System.out.println("Success");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
