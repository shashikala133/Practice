package com.shashikala.practice.tictactoeSimple;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Board board=new Board(3);


        Scanner sc=new Scanner(System.in);
        System.out.println("enter player 1 name: ");
        Player player1=new Player(sc.next(),'X');
        System.out.println("enter player 2 name: ");
        Player player2=new Player(sc.next(),'O');
        board.printBoard();
        Player current=player1;
        while (true){
            System.out.println("enter row number: ");
            int row=sc.nextInt();
            System.out.println("enter col number: ");
            int col=sc.nextInt();
            Character symbol=current.getSymbol();
            boolean makeMove = board.makeMove(row, col, symbol);
            if(makeMove){
                boolean checkWin = board.checkWin(row, col, symbol);
                if(checkWin){
                    System.out.println(player1.getName()+" has won");
                    return;
                }else{
                    if(board.isFull()){
                        System.out.println("draw....");
                        return;
                    }else{
                        current=current==player1?player2:player1;
                    }
                }
            }else{
                System.out.println("not a valid number");
            }
            board.printBoard();

        }


    }
}
