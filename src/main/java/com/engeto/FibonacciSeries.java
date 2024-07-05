package com.engeto;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number:");
        int n = scanner.nextInt();
        int first = 0;
        int second = 1;

        System.out.println("Fibonacci series from 0 to "+n);

        while (first<=n){
            System.out.println(first+" ");
            int next = first + second;
            first = second;
            second = next;

        }
    }
}
