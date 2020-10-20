package com.javaoop;

class Polos{
    String dataString;
    int dataInteger;
}

// class dengan constructor
class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;


    // constructor dengan parameter
    Mahasiswa(String inputNama, String inputNIM, String inputJurusan){
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputJurusan;

        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(jurusan);
    }
}


public class constructor {
    public static void main(String[] args) throws Exception {

        Mahasiswa mahasiswa1 = new Mahasiswa("ucup", "13305041", "teknik perteknikan");
        Mahasiswa mahasiswa2 = new Mahasiswa("otong", "13305042", "teknik pertambangan");
    }
}