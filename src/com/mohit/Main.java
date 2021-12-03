package com.mohit;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Starting execution of the main method");
        Game game=new Game(10,1);
        game.addPlayers(new User("A"));
        game.addPlayers(new User("B"));
        game.addPlayers(new User("C"));
        game.addPlayers(new User("D"));
        game.launch();
    }
}
