package com.tutorial;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        String  username;
        String password;
        int salah=0;
        Scanner inputUser = new Scanner(System.in);

        System.out.println("Login");

        do {
            salah++;

            System.out.print("Masukkan Username: ");
            username = inputUser.next();

            System.out.print("Masukkan Password: ");
            password = inputUser.next();

            if (username.equals("gabriel") && password.equals("gabriel123")){
                System.out.println("Username dan Password benar !");
                return ;
            }else{
                System.out.println("Username dan Password Salah, telah salah - "+salah);
            }

        }while(salah <= 3);


    }
}