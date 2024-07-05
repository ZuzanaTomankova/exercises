package com.engeto;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number:");
        int num = scanner.nextInt();
        if (num % 2==0){
            System.out.println("Number "+num+" is even.");
        } else {
            System.out.println("Number "+num+" is odd.");
        }
    }
}
