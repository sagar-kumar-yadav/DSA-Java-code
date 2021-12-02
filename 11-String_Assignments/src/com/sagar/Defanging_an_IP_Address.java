package com.sagar;

// https://leetcode.com/problems/defanging-an-ip-address/
// 1108. Defanging an IP Address

import java.util.Arrays;

public class Defanging_an_IP_Address {

    public static void main(String[] args) {
	    String address = "1.1.1.1";     // output = "1[.]1[.]1[.]1"
        System.out.println(defangIPaddr(address));
    }
    public static String defangIPaddr(String address){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                sb.append("[.]");
            }
            else {
                sb.append(address.charAt(i));
            }
        }
        return sb.toString();
    }
}
