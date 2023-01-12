package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a == b && b == c) System.out.println("" + a + " " + a + " " + a);
        else if (a == b || b == c ) System.out.println("" + b + " " + b);
        else if (a == c) System.out.println("" + a + " " + a);;
    }
}
