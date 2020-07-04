package com.company;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a: ");
        int a = scanner.nextInt();

        for (int i = 99; i < 1000; i++) {
            if(i%10 == a || (i/10)%10 == a || (i/100) == a){
                System.out.println(i);
            }
        }
    }
}
