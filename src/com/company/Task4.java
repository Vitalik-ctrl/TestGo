package com.company;
 import java.util.*;
public class Task4 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if( a%2 == 0 && b%2 != 0){
            System.out.println("Yes");
        }else if(a%2 !=0 && b%2 == 0){
            System.out.println("Yes");
        }
        if((a%2 == 0 && b %2 == 0) || (a%2 != 0 && b%2 != 0)){
            System.out.println("no");
        }
    }
}
