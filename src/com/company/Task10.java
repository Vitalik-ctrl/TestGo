package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int num = SC.nextInt();

        ArrayList list = new ArrayList();
        for (int i = 1; i <= num; i++) {
            if(num%i == 0){
                list.add(i);
            }
        }
        if(list.size() == 2){
            System.out.println("Yes");
            return;
        }else {
            System.out.println("No");
        }
        System.out.println(Collections.min(list));
    }
}
