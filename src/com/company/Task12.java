package com.company;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        long num = scanner.nextLong();
        long num1 = num%10;
        num = num/10;
        while (num != 0){
            num1 = num%10;
            num = num/10;
            count++;
        }
        System.out.println(count);
    }
}
