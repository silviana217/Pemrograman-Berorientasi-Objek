package com.javaoop;

class Data_Mahasiswa{

    String nim;
    String nama_l;
    String jurusan;
    int angkatan;
}

public class Main {

    public static void main(String[] args) {
        Data_Mahasiswa input = new Data_Mahasiswa();
        input.nim = "2020071011";
        input.nama_l = "Udin";
        input.jurusan = "Psikolog";
        input.angkatan = 2020;

        System.out.println("NIM = " + input.nim);
        System.out.println("Nama = " +input.nama_l);
        System.out.println("Jurusan " + input.jurusan);
        System.out.println("Angkatan = " + input.angkatan);
        System.out.println("===========================");

        Mahasiswa maha = new Mahasiswa();

        maha.input_angkatan(2019);
        maha.input_jurusan("Informatika");
        maha.input_nama("Aldi");
        maha.input_nim("201901044");

        // Pemanggilan method Nama, NIM, Jurusan, dan Angkatan

        System.out.println("Nama : " + maha.nama_ms());
        System.out.println("NIM : " + maha.nim_ms());
        System.out.println("Jurusan : " + maha.jurusan_ms());
        System.out.println("Angkatan : " + maha.angkatan_ms());
        System.out.println("===============================");


        System.out.println("NIM : " + maha.Nama());
        System.out.println("Nama : " + maha.NIM());
        System.out.println("Jurusan : " + maha.Jurusan());
        System.out.println("Angkatan : " + maha.Angkatan());

    }
}
