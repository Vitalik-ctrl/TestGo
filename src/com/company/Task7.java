package com.company;

public class Task7 {
    public static void main(String[] args) {

         double x = -10;
       while(x <= 10){
           double y = Math.sqrt(5 * Math.pow(x, 2)) + ((2 * x) + 2.5);
           System.out.println("x = " + x + " y = " + y);
           x+=2.5;
       }
    }
}
