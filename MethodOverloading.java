package com.tutorial;

public class MethodOverloading {

    static int plusMethod(int x, int y){
        return x + y;
    }

    static  double plusMethod(double x, double y) {
        return x + y;
    }

    static String plusMethod(String x, int y){
        String hasil = "Nama " + x + ", Umur " + y + " Tahun";
        return hasil;
    }
    static String plusMethod(String x, String y){
        String hasil1 = "Nama " + x + " Nama " + y;
        return hasil1;
    }

    public static void main(String[] args) {
        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);
        String myNum3 = plusMethod("Andi", 17);
        String myNum4 = plusMethod("Gabriel", "Samuel");
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
        System.out.println("Keterangan: " + myNum3);
        System.out.println("Nilai String " +myNum4);

    }

}
