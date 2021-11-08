package sagar;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    public arrayList() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList arr = new ArrayList();

        while(true) {
            int i = sc.nextInt();
            if (i < 0) {
                for(i = arr.size() - 1; i >= 0; --i) {
                    PrintStream var10000 = System.out;
                    Object var10001 = arr.get(i);
                    var10000.print(var10001 + " ");
                }

                System.out.println();
                return;
            }

            arr.add(i);
        }
    }
}
