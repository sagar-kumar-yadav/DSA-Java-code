package com.sagar;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class day28 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        String str = "@gmail.com";
        List<String> ls = new ArrayList<>();

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, N).forEach(NItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                String firstName = firstMultipleInput[0];

                String emailID = firstMultipleInput[1];
                
                if (emailID.contains(str)){
                    ls.add(firstName);
                }
                
                
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        
        Collections.sort(ls);

        for (int i = 0; i < ls.size(); i++) {
            String first = ls.get(i);
            System.out.println(first);
        }

        bufferedReader.close();
    }
}
