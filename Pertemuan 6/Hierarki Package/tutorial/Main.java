package com.tutorial;

// Mengimport Class Console

import com.terminal.Console;

import static com.terminal.Console.log;

class Main {

    public static void main(String[] args) {
	Player player1 = new Player("Otong");
	player1.show();

	Console.log("Menampilkan data dengan console.log");
	Console.log(player1.getName());

	log("Menampilkan data dengan log saja");
	log(player1.getName());
    }
}
