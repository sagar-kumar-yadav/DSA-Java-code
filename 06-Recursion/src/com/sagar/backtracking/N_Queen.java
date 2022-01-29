package com.sagar.backtracking;

public class N_Queen {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] borad = new boolean[n][n];
        nQueen(borad, 0);
    }

    static int nQueen(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            return 1;
        }

        int count = 0;

        // placing the queen and checking for every row and column
        for (int col = 0; col < board.length; col++) {
            // place the queen if it is safe
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                count += nQueen(board, row + 1);
                board[row][col] = false;
            }

        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        // check diagonal left
        int maxLeft = Math.min(row, col);
        for (int i = 0; i <= maxLeft; i++) {
            if (board[row-i][col-i]) {
                return false;
            }
        }
        // check diagonal right
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 0; i <= maxRight; i++) {
            if (board[row-i][col+i]) {
                return false;
            }
        }

        return true;
    }

    private static void display(boolean[][] board) {
        for (int i = 0; i < board.length; i++) {
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
