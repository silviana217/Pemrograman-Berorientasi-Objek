package com.pboreg;

import java.util.*;
class pegawai{
    String nama;
    int umur;
    int NIP;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }

    public int getUmur() {
        return umur;
    }

    public int getNIP() {
        return NIP;
    }

    public void setNIP(int NIP) {
        this.NIP = NIP;
    }

    public static double persenPajak(double a, int b){
        return a / b;
    }
}

class gaji extends pegawai {
    int jam_kerja;
    int golongan;


    public int getJam_kerja() {
        return jam_kerja;
    }

    public void setJam_kerja(int jam_kerja) {
        this.jam_kerja = jam_kerja;
    }

    public int getGolongan() {
        return golongan;
    }

    public void setGolongan(int golongan) {
        this.golongan = golongan;
    }

void perhitungan_gaji() {
    int gajipokok = 0;
    int tunjangan = 0;
    int gajilembur;
    int totalgaji;
    int lembur;

    if (golongan == 1) {
        gajipokok = 1486500;
        tunjangan = 250000;
    }
    if (golongan == 2) {
        gajipokok = 1926000;
        tunjangan = 300000;
    }
    if (golongan == 3) {
        gajipokok = 2456700;
        tunjangan = 350000;
    }
    if (golongan == 4) {
        gajipokok = 2899500;
        tunjangan = 400000;
    }
    if (jam_kerja <= 172) {
        lembur = 0;
        System.out.println("Tidak mendapat uang lembur");
    }
    else {
        lembur = jam_kerja - 173;
    }
    gajilembur = lembur * 20000;
    System.out.println("\tGaji Pokok Anda  = Rp.  " + gajipokok);
    System.out.println("\tTunjangan Anda   = Rp.  " + tunjangan);
    System.out.println("\tGaji Lembur Anda = Rp.  " + gajilembur);
    totalgaji = gajipokok + tunjangan + gajilembur;
    System.out.println("=====================================");
    System.out.println("Total Gaji Anda adalah = RP.   " + totalgaji);
    System.out.println("=====================================");
    double pajak = persenPajak(0.5, 100) * totalgaji;
    double gajipajak = totalgaji - pajak;
    System.out.println("Total Gaji setelah terkena pajak = Rp.   " + gajipajak);
}
}
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        gaji gaji_peg = new gaji();
        String nama;
        int jam_kerja;
        int umur;
        int NIP;
        int golongan;

        System.out.println("Masukkan Data Diri");
        System.out.print("Nama : ");
        nama = input.nextLine();
        System.out.print("Umur : ");
        umur = input.nextInt();
        System.out.print("Jam kerja : ");
        jam_kerja = input.nextInt();
        System.out.print("Golongan Pekerja : ");
        golongan = input.nextInt();
        System.out.print("NIP : ");
        NIP = input.nextInt();
        System.out.println("========================");
        System.out.println("\t  ");
        System.out.println("========================");
        gaji_peg.setNama(nama);
        gaji_peg.setUmur(umur);
        gaji_peg.setNIP(NIP);
        gaji_peg.setJam_kerja(jam_kerja);
        gaji_peg.setGolongan(golongan);


        System.out.println("Nama : " + gaji_peg.getNama());
        System.out.println("Umur : " + gaji_peg.getUmur());
        System.out.println("NIP : " + gaji_peg.getNIP());
        System.out.println("Jam Kerja : " + gaji_peg.getJam_kerja());
        System.out.println("Golongan : " + gaji_peg.getGolongan());
        System.out.println("\n");
        System.out.println("\t ===Golongan Ke- " + golongan + "====");
        gaji_peg.perhitungan_gaji();
    }
}
