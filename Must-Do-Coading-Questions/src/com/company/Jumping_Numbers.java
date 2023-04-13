package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Jumping_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(jumpingNums(x));
    }
    static long jumpingNums(long X) {
        long ans = 0;

        Queue<Long> q = new LinkedList<>();

        for(int i=1; i<=9;i++){
            q.clear();
            q.add((long)i);

            while(!q.isEmpty()){

                Long val = q.remove();

                if(val<X){
                    ans = Math.max(ans, val);
                }
                else if(val==X){
                    return X;
                }
                else if(val>X){
                    continue;
                }
                long lastdigit = val%10;

                if(lastdigit==0){
                    val = val*10 + (lastdigit+1);
                    q.add(val);

                }

                else if(lastdigit==9){
                    val = val*10 + (lastdigit-1);
                    q.add(val);
                }

                else{
                    long val1 = val*10 + (lastdigit+1);
                    q.add(val1);
                    long val2 = val*10 + (lastdigit-1);
                    q.add(val2);
                }
            }

        }

        return ans;
    }
}
