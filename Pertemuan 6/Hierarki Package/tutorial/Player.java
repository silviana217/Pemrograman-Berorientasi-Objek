package com.tutorial;

import com.terminal.Console;
// visibility default
class Player {
    private String name;

    Player(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }

    void show(){
        Console.log("Menggunakan Console");
        Console.log("Player name : " + this.name);
    }
}
