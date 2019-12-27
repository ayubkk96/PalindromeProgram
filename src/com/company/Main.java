package com.company;

public class Main {

    public static void main(String[] args) {

        palindromeChecker("madam");

    }

    public static void palindromeChecker(String input) {

        StringBuilder stringBufferConverter = new StringBuilder();

        stringBufferConverter.append(input);

        if (input.contentEquals(stringBufferConverter.reverse())) {
            System.out.println("Yes, this is a palindrome");
        }
        else {
            System.out.print("No");
        }
    }
}