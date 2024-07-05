package com.engeto;

import java.util.Scanner;

public interface Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert word:");
        String word = scanner.nextLine();
        String reversed = new StringBuilder(word).reverse().toString();

            if (word.equalsIgnoreCase(reversed)){
                System.out.println("Word "+word+" is palindrome");
            }else {
                System.out.println("Word "+word+" is not palindrome");
            }
    }
}
