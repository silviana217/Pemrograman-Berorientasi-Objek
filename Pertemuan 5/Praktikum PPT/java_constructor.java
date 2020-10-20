package com.pboreg;

public class java_constructor {
    int modelYear;
    String modelName;

    public java_constructor(int year, String name) {
        modelYear = year;
        modelName = name;

    }

    public static void main(String[] args){
        java_constructor myCar = new java_constructor(1969, "Mustang");
        System.out.println(myCar.modelYear+" "+ myCar.modelName);
    }
}
