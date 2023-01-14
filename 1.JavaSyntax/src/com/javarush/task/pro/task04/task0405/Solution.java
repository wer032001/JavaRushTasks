package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        int n = 0;
        while (n < 10) {
            if ((n == 0) || (n == 9)) {
                int m = 0;
                while (m < 20) {
                    System.out.print("Б");
                    m++;
                }
            } else {
                System.out.print("Б");
                int m = 0;
                while (m < 18) {
                    System.out.print(" ");
                    m++;
                }
                System.out.print("Б");
            }
            System.out.println();
            n++;
        }
    }
}