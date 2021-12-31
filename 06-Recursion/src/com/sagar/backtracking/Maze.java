package com.sagar.backtracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(count(3, 3));

//        path("", 3, 3);

//        System.out.println(pathRet("", 3, 3));

//        System.out.println(pathDiagonallyRet("", 3, 3));

        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };

        pathRestrictions("", board, 0, 0);
    }

    // find count
    public static int count(int row, int col) {
        // base condition
        if (row == 1 || col == 1) {
            return 1;
        }

        int left = count(row -1, col);
        int right = count(row, col-1);
        return left + right;
    }

    // find path
    public static void path(String p, int row, int col) {
        // base condition
        if (row == 1 & col == 1) {
            System.out.println(p);
            return;
        }

        if (row > 1) {
            path(p + 'D', row-1, col);
        }

        if (col > 1) {
            path(p + 'R', row, col-1);
        }
    }

    // path ret
    public static ArrayList<String> pathRet(String p, int row, int col) {

        ArrayList<String> list = new ArrayList<>();
        if (row == 1 && col == 1) {
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        if (row > 1) {
            ans.addAll(pathRet(p + 'D', row-1, col));
        }

        if (col > 1) {
            ans.addAll(pathRet(p + 'R', row, col-1));
        }
        return ans;
    }

    // diagonally path
    public static ArrayList<String> pathDiagonallyRet(String p, int row, int col) {

        ArrayList<String> list = new ArrayList<>();
        if (row == 1 && col == 1) {
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        if (row > 1 && col > 1){
            ans.addAll(pathDiagonallyRet(p + 'D', row-1, col-1));
        }

        if (row > 1) {
            ans.addAll(pathDiagonallyRet(p + 'V', row-1, col));
        }

        if (col > 1) {
            ans.addAll(pathDiagonallyRet(p + 'H', row, col-1));
        }
        return ans;
    }

    // path restrictions
    public static void pathRestrictions(String p, boolean maze[][], int row, int col) {
        // base condition
        if (row == maze.length - 1 & col == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[row][col]) {
            return;
        }

        if (row < maze.length - 1) {
            pathRestrictions(p + 'D',maze , row+1, col);
        }

        if (col < maze[0].length - 1) {
            pathRestrictions(p + 'R', maze, row, col+1);
        }
    }
}
