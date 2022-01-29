package com.sagar.assignment;

// Robot Return to Origin

class Robot_Return_to_Origin {
    public static void main(String[] args) {
        String moves = "UD";
        System.out.println(judgeCircle(moves));
    }
    public static boolean judgeCircle(String moves) {
        int countUD = 0;
        int countRL = 0;
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'U'){
                countUD++;
            }
            else if (moves.charAt(i) == 'D') {
                countUD--;
            }
            else if (moves.charAt(i) == 'R') {
                countRL++;
            }
            else {
                countRL--;
            }
        }
        if (countUD == 0 && countRL == 0) {
            return true;
        }
        return false;
    }
}