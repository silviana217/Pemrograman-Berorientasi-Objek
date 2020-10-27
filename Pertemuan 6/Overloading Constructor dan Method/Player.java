package com.tutorial;

public class Player {

    private String name;
    private static int jumlahPlayer;

    //Overloading Constructor
    // Opsi 1
    Player(String name){
        Player.jumlahPlayer++;
        this.name = name;
    }

    //Opsi 2:
    Player(){
        Player.jumlahPlayer++;
        this.name = "player" + Player.jumlahPlayer;
    }

    void show(){
        System.out.println("Name : " + this.name);
    }
}
