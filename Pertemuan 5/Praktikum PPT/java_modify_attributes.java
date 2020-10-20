package com.pboreg;

import jdk.swing.interop.SwingInterOpUtils;

public class java_modify_attributes {

    int x = 10;

    public static void main(String[] args){
        java_modify_attributes myObj = new java_modify_attributes();
        myObj.x = 25;
        System.out.println(myObj.x);
    }

}
