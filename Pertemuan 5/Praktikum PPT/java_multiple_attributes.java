package com.pboreg;

public class java_multiple_attributes {

    String fname = "John";
    String lname = "Doe";
    int age = 24;

    public static void main(String[] args) {
        java_multiple_attributes myObj = new java_multiple_attributes();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Age: " + myObj.age);
    }
}
