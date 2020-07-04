package com.company;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("C: ");
        long A = scanner.nextLong();
        System.out.println("B: ");
        long B = scanner.nextLong();
        System.out.println("C: ");
        long C = scanner.nextLong();

        long S = 2 * ((A * B) + (B * C) + (A * C));
        System.out.println("S = " + S);
    }
}
