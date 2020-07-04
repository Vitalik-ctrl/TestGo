package com.company;

public class Task14 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1000; i < 9999; i++) {
            if (i % 2 != 0) {
                if (i % 10 != 9 && (i/10)%10 != 9 && (i/100)%10 != 9 && (i/1000)%10 != 9) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
