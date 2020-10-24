package com.javaoop;

public class Mahasiswa {
    String nama;
    long angkatan;
    String jurusan;
    String nim;

    public String nama_ms(){
        return this.nama;
    }
    public long angkatan_ms(){
        return this.angkatan;
    }
    public String jurusan_ms(){
        return this.jurusan;
    }
    public String nim_ms(){
        return this.nim;
    }
    public void input_nim(String nim_maha){
        this.nim = nim_maha;
    }
    public void input_nama(String nama_maha){
        this.nama = nama_maha;
    }
    public void input_jurusan(String jurusan_maha){
        this.jurusan = jurusan_maha;
    }
    public void input_angkatan(long angkatan_maha){
        this.angkatan = angkatan_maha;
    }

    public String Nama() {
        String nama = "Christoper";
        return nama;
    }
    public int NIM() {
        int nim = 2020071017;
        return nim;
    }
    public String Jurusan() {
        String jurusan = "Sistem Informasi";
        return jurusan;
    }
    public int Angkatan() {
        int angkatan = 2020;
        return angkatan;
    }

}
