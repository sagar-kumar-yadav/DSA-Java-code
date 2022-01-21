package com.sagar.backtracking;

public class N_Queen {
    public static void main(String[] args) {

    }

    static int nQueen(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            return 1;
        }

    }

    private static void display(boolean[][] board) {
        for (int i = 0, boardLength = board.length; i < boardLength; i++) {
            boolean[] row = board[i];
            for (int j = 0; j < row.length; j++) {
                boolean element = row[j];
                if (element) {
                    System.out.println("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
