package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошего не бывает много
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int num = scanner.nextInt();
        int n = 0;
        do {
            System.out.println(str);
            if ((num <= 0) || ( num >= 5))
                break;
            n++;
        } while (n < num);
    }
}