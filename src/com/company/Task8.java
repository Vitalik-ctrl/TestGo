package com.company;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();

        int [] array = new int[count];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i] > 99 && array[i] < 1000){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
