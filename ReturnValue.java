package com.tutorial;

public class ReturnValue {
    static int myMethod(int x, int y) {
        return x + y;
    }

    public static void main (String[] args){
        System.out.println(myMethod(4, 3));
    }
}