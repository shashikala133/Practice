package com.shashikala.practice.tictactoeSimple;

import java.util.Arrays;

public class Board {
    private int size;
    private Character[][] board;

    public Board(int size) {
        this.size = size;
        board=new Character[size][size];
        for(int i=0;i<size;i++){
            Arrays.fill(board[i],'_');
        }
    }

    public void printBoard(){
        for(int i=0;i<size;i++){
            for(int j=0;j<board[i].length;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    public boolean makeMove(int row, int col, Character symbol){
        if(row<0 || row>size-1 || col<0 || col > size-1 || board[row][col]!='_'){
            return false;
        }
        board[row][col]=symbol;
        return true;
    }

    public boolean checkWin(int row,int col,Character symbol) {
       boolean win=true;
       for(int j=0;j<size;j++){
           if(board[row][j]!=symbol){
               win=false;
               break;
           }
       }
       if (win) return true;
      win=true;
       for(int j=0;j<size;j++){
           if(board[j][col]!=symbol){
               win=false;
               break;
           }
       }
        if (win) return true;
     if(row==col){
         win=true;
         for(int j=0;j<size;j++){
             if(board[j][j]!=symbol){
                 win=false;
                 break;
             }

         }
         if(win) return true;
     }


       if(row+col==size-1){
           win=true;
           for(int j=0;j<size;j++){
               if(board[j][size-1-j]!=symbol){
                   win=false;
                   break;
               }

           }
           if(win) return true;
       }
       return false;
    }

    public boolean isFull(){
        for(int i=0;i<size;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]=='_') return false;
            }
        }
        return true;
    }


}
