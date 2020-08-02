package com.academy;


import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Task_1 {

    public static void main(String[] args) {
        String someText = "This is some tex. Only for example.";
        List<Character> charList = someText.chars().mapToObj(c -> (char) c).collect(Collectors.toList());

        print(charList);

        Collections.sort(charList);

        print(charList);

        TreeSet<Character> collectionOfChars = new TreeSet<>(charList);
        print(collectionOfChars);

        for (Character coll : collectionOfChars) {
            long occurrencesCount = someText.chars().filter(ch -> ch == coll).count();
            System.out.println("Count of '" + coll + "' is " + occurrencesCount);
        }
    }

    private static void print(Collection<Character> charList) {
        for (Character coll : charList) {
            System.out.print(coll);
        }
        System.out.println();
    }
}
