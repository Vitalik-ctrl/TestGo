package com.company;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b;

        b = a % 10;
        a = a / 10;
        while (a > 0) {
            if(a%10 > b) {
                b = a % 10;
            }
                a = a/10;
            }
        System.out.println(b);
    }
}
