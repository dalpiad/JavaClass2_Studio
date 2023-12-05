package org.example;

import java.util.Scanner;
import java.util.HashMap;

public class CountingChars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String statement = "If the product of two terms is zero then common " +
                "sense says at least one of the two terms has to be zero to " +
                "start with. So if you move all the terms over to one side, " +
                "you can put the quadratics into a form that can be factored" +
                " allowing that side of the equation to equal zero. Once you’ve " +
                "done that, it’s pretty straightforward from there.";

        System.out.println("Enter a word, sentence or paragraph to evaluate. ");
        statement = input.nextLine();


        char[] charactersInString = statement.toLowerCase().toCharArray();


        HashMap<Character, Integer> charsCount = new HashMap<>();

        for (Character letter : charactersInString) {
            if (charsCount.containsKey(letter)) {
                charsCount.put(letter, (charsCount.get(letter) +1));
            } else {
                charsCount.put(letter, 1);
            }
        }
        for (Character i : charsCount.keySet()) {
            System.out.println(i + ": " + charsCount.get(i));
        }
    }
}
