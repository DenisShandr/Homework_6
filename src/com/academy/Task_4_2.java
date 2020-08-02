package com.academy;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Task_4_2 {
    public static final int SIZE = 1000000;

    public static void main(String[] args) {

        long startTime;
        long endTime;

        HashSet hashSet = new HashSet();
        TreeSet treeSet = new TreeSet();

        Integer[] arrayOfInteger = new Integer[SIZE];
        for (int i = 0; i < SIZE; i++) {
            arrayOfInteger[i] = (int) (Math.random() * SIZE);
        }

        startTime = System.currentTimeMillis();
        addTo(hashSet);
        endTime = System.currentTimeMillis();
        System.out.println("Time for HashMap add: " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        addTo(treeSet);
        endTime = System.currentTimeMillis();
        System.out.println("Time for TreeMap add: " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        find(hashSet, 4545);
        endTime = System.currentTimeMillis();
        System.out.println("Time for HashMap find: " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        find(treeSet, 4545);
        endTime = System.currentTimeMillis();
        System.out.println("Time for TreeMap find: " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        removeOf(hashSet);
        endTime = System.currentTimeMillis();
        System.out.println("Time for HashMap remove: " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        removeOf(treeSet);
        endTime = System.currentTimeMillis();
        System.out.println("Time for TreeMap remove: " + (endTime - startTime));


    }

    private static void addTo(Set<Integer> set) {
        for (int i = 0; i < SIZE; i++) {
            set.add(i);
        }
    }

    private static void removeOf(Set<Integer> set) {
        for (int i = 0; i < SIZE; i++) {
            set.remove(i);
        }
    }

    private static void find(Set<Integer> set, int s) {
        for (int i = 0; i < set.size(); i++) {
            if (set.contains(s)) {
                System.out.println(s + " founded.");
                break;
            }
        }
    }
}
