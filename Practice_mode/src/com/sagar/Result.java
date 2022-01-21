package com.sagar;

class Result {

    /*
     * Complete the 'decryptPassword' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */
    public static void main(String[] args) {
        String s = "aP1pL5e";
        System.out.println(decryptPassword(s));
    }

    public static String decryptPassword(String s) {
    // Write your code here
        char[] ch = s.toCharArray();
        int x = 0;
        StringBuilder sb = new StringBuilder();

        int i = 0;
        while (i != ch.length){
            if (ch[i] >= 'a' && ch[i] < 'z' && ch[i+1] >= 'A' && ch[i+1] <= 'Z') {
                sb.append(ch[i + 1]);
                sb.append(ch[i]);
                sb.append(ch[i+2] = '*');
            }
            i+=2;

            if ( ch[i] >= '1' || ch[i] <= '9'){
                sb.append(ch[i+3] = '0');
            }
            i++;
        }

        return sb.toString();
    }

}
