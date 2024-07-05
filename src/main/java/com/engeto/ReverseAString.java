package com.engeto;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Insert string:");
        String input = scanner.nextLine();
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed string is: "+reversed);

    }
}
