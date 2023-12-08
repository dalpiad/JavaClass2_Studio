package org.example;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;

public class CountingChars {
    public static void main(String[] args) {
        String quoteFromFile = "";

        try {

        } catch (FileNotFoundException e) {
            System.out.println("An error occured while trying to access the file.");
        }

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word, sentence or paragraph to evaluate. ");
        String statement = input.nextLine();

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        char[] charactersInString = statement.toUpperCase().toCharArray();

        HashMap<Character, Integer> charsCount = new HashMap<>();

        for (Character letter : charactersInString) {
            if (alphabet.indexOf(letter) >= 0) {
                if (charsCount.containsKey(letter)) {
                    charsCount.put(letter, (charsCount.get(letter) +1));
                } else {
                    charsCount.put(letter, 1);
                }
            }

        }
        for (Character i : charsCount.keySet()) {
            System.out.println(i + ": " + charsCount.get(i));
        }
    }
}
