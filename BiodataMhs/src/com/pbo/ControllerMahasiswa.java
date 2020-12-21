package com.pbo;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class ControllerMahasiswa {

    public TextField textNama;
    public TextField textNIM;
    public TextField textUmur;
    public TextField textJurusan;

    private Koneksi koneksi = new Koneksi();

    public void buttonSubmitOnClick(ActionEvent actionEvent) {

        String nama = textNama.getText();
        String nim = textNIM.getText();
        String umur = textUmur.getText();
        String jurusan = textJurusan.getText();

        textNama.setText("");
        textNIM.setText("");
        textUmur.setText((""));
        textJurusan.setText("");

        String query = "INSERT INTO biodata_mahasiswa(Nama,NIM,Umur,Jurusan) VALUES('" + nama + "', " + nim + ", " + umur + ", '" + jurusan + "')";
        int hasil = koneksi.manipulasiData(query);
        if (hasil == 1) {
            System.out.println("Data berhasil diinput kedalam tabel");
        }
    }
}
