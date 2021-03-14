/**
 * Ilkin Hasanov
 * <p>
 * Copyright (c) HASANOV.
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

/**
 * IKIN HASANOV's response to Homework "Array practice", Module 1.
 *
 *   Task:
 *      1. Find in the net and download a text version of a novel about
 *         Harry Potter. For instance, "Harry Potter and the Sorcerer's Stone".
 *      2. Split the novel into an array of words.
 *      3. Clean the words from a punctuation signs.
 *      4. Create another array containing distinct words.
 *      5. Order the words in alphabetic order.
 *
 * @version 1.10 14-03-2021
 * @author Ilkin Hasanov
 */

public class ArrayPractice {
    public static void main(String[] args) throws IOException {
//      1. Find in the net and download a text version of a novel about
//      Harry Potter. For instance, "Harry Potter and the Sorcerer's Stone".
        String harry = new String(Files.readAllBytes(Paths
                .get("src\\harry.txt")));

//      3. Clean the words from a punctuation signs.
        harry = harry.replaceAll("[^a-zA-Z0-9' ]", "").toLowerCase()
                .replaceAll(" '", "").replaceAll("' ", "");
        while (harry.contains("  ")) {
            harry = harry.replaceAll("  ", " ");
        }

//      2. Split the novel into an array of words.
        String[] harryWords = harry.split(" ");

//      5. Order the words in alphabetic order.
        Arrays.sort(harryWords);

//      4. Create another array containing distinct words.
        String[] distinctWordsOfHarry = Arrays.stream(harryWords)
                .distinct().toArray(String[]::new);

        System.out.println(Arrays.toString(distinctWordsOfHarry));
    }
}