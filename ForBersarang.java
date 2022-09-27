package com.smkn40jakarta.perulangan;

public class ForBersarang {
    public static void main(String[] args) {
        int a = 10;
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}