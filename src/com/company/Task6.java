package com.company;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if( a + b + c == 180 && a != 0 && b !=0 && c != 0){

            if(a == 90 || b == 90 || c == 90){
                System.out.println("Треугольник прямоугольный");
            }
            if( a > 90 || b > 90 || c > 90){
                System.out.println("Треугольник тупоугольный");
            }
            if(a < 90 && b < 90 && c < 90){
                System.out.println("Треугольник остроугольный");
            }
        }
        else{
            System.out.println("Triangle does not exist");
        }
    }
}
