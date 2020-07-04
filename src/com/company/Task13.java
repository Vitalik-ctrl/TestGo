package com.company;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        int M = 1000;
        int D = 500;
        int C = 100;
        int L = 50;
        int X = 10;
        int V = 5;
        int I = 1;

        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();
        if(num.equals("M+D")){
            System.out.println(M+D);
        }
    }
}
