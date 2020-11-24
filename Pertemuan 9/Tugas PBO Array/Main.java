package com.pboreg;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        int banyak = 10, x, benar = 0, i = 0;

        Scanner s = new Scanner(System.in);

        int a[] = new int[banyak];

        System.out.println("Masukkan Angka:");

        for(i = 0; i < banyak; i++)

        {
            a[i] = s.nextInt();
        }

        System.out.print("Masukkan Angka yang ingin dicari:");

        x = s.nextInt();

        for(i = 0; i < banyak; i++)
        {
            if(a[i] == x)
            {
                benar = 1;
                break;

            }
            else
            {
                benar = 0;
            }
        }
        if(benar == 1)
        {
            System.out.println("Angka ditemukan");
        }
        else
        {
            System.out.println("Angka tidak ditemukan");

        }
    }
}
