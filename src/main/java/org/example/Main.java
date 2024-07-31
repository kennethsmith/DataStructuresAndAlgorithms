package org.example;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        final String[] learning = {
            "Arrays and Strings",
            "Hashing",
            "Linked Lists",
            "Stacks and Queues",
            "Trees and Graphs",
            "Heaps",
            "Greedy",
            "Binary Search",
            "Backtracking",
            "Dynamic programming"
        };

        //What we are going to code.
        Arrays.stream(learning).forEach(System.out::println);

    }
}