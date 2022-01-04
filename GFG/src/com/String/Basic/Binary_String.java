package com.String.Basic;

class Binary_String {
    public static void main(String[] args) {
        int n = 4;
        String str = "10101";
        System.out.println(binarySubstring(n, str));
    }
    //Function to count the number of substrings that start and end with 1.
    public static int binarySubstring(int a, String str) {
        // Your code here

        // bruteforce
/*
        int count = 0;

        // pick a start point
        for (int i = 0; i < a; i++) {
            if (str.charAt(i) == '1'){

                // search all possible ending point
                for (int j = i+1; j < a; j++) {
                    if (str.charAt(j) == '1'){
                        count++;
                    }
                }
            }
        }
        return count;
*/

/*
        // optimise
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1'){
                count++;
            }
        }
        return count*(count-1)/2;
*/

        // using substring
        int totalSub = 0;
        int totalOnes = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                totalOnes++;
                totalSub = totalSub + totalOnes - 1;
            }
        }
        return totalSub;
    }
}
