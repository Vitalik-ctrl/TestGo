package com.company;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int x = scanner.nextInt();
         int y = scanner.nextInt();
         if(y != 0 && x != (-2 * y)){
             double z = (Math.sqrt(Math.pow(x, 2) + Math.sqrt(y))/ ( x + 2 * y)) + (Math.abs(y - 2 * x)/ 5 * y);
             System.out.println(z);
         }else{
             System.out.println(":( error");
         }
    }
}
