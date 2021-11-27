package com.serialization;

import java.io.Serializable;

public class Employee implements Serializable {
    public final long  serialVersionUUID = 1L;
    public static String universityName = "MAKERERE UNIVERSITY";
    public String name;
    public transient String department;
    public  int id;
    public int age;
    public double salary;
    //allArgs Constructor
    public Employee(String n, String d,int empId, int a, double s){
        this.name = n;
        this.department = d;
        this.id = empId;
        this.age = a;
        this.salary = s;
    }

    //NoArgsConstructor
    public Employee(){}
}
