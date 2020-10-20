package com.pboreg;

public class java_multiple_objects {

    int x = 5;

    public static void main(String[] args){
        java_multiple_objects myObj1 = new java_multiple_objects();
        java_multiple_objects myObj2 = new java_multiple_objects();
        myObj2.x = 25;
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
    }
}
