package com.mohit;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Game {
    public Board board;
    public Queue<User> players;
    public Queue<User> winners;
    public int dices;
    public int dimension;
    public int cellCount;

    public Game(int dices, int dimension){
        this.dimension = dimension;
        this.dices = dices;
        this.cellCount = dimension*dimension;
        this.board = new Board(dimension);
        this.players = new LinkedList<User>();
        this.winners = new LinkedList<User>();
    }

    public void launch(){
        this.board.printBoard();

        while(players.size()>1){
            User currPlayer = players.poll();
            System.out.println();
            System.out.println(currPlayer.getUserName() + "'s turn");
            System.out.println("Press r to roll the dice");

            Scanner sc = new Scanner(System.in);
            char c = sc.next().charAt(0);
            makeMove(currPlayer);

            if(currPlayer.getPosition() == cellCount){
                System.out.println(currPlayer.getUserName() + " has won!");
                winners.add(currPlayer);
            }else{
                players.add(currPlayer);
            }

            printPositions();
        }
    }

    private void makeMove(User user){
        int currPosition = user.getPosition();
        int moves = DiceService.roll(this.dices);

        System.out.println("The move is " + moves);
        int finalPosition = currPosition+moves;
        if(finalPosition<=cellCount){
            if(board.hasEntityHead(finalPosition)){
                System.out.println(board.getBoardEntity(finalPosition).getEncounterMessage());
                finalPosition = board.getBoardEntity(finalPosition).getEnd();
            }
        }
        user.setPosition(finalPosition);
    }

    private void printPositions(){
        for(User user:players){
            System.out.println(user.getUserName() + " : " + user.getPosition());
        }
    }

    public Queue<User> getPlayers() {
        return players;
    }

    public void addPlayers(User player) {
        this.players.add(player);
    }

    public Queue<User> getWinners() {
        return winners;
    }

    public void setWinners(Queue<User> winners) {
        this.winners = winners;
    }

    public int getDices() {
        return dices;
    }

    public void setDices(int dices) {
        this.dices = dices;
    }

    public int getCellCount() {
        return cellCount;
    }

    public void setCellCount(int cellCount) {
        this.cellCount = cellCount;
    }
}
