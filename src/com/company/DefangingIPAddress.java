package com.company;

public class DefangingIPAddress {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        String result = address.replace(".", "[.]");
        //return result;
    }
}

//Output: "1[.]1[.]1[.]1"