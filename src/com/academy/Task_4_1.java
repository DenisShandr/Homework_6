package com.academy;

import java.util.*;

public class Task_4_1 {

    public static final int SIZE = 1000000;

    public static void main(String[] args) {

        long startTime;
        long endTime;

        HashMap<Integer, Integer> hashMap = new HashMap();
        TreeMap<Integer, Integer> treeMap = new TreeMap();
        HashSet hashSet = new HashSet();
        TreeSet treeSet = new TreeSet();

        Integer[] arrayOfInteger = new Integer[SIZE];
        for (int i = 0; i < SIZE; i++) {
            arrayOfInteger[i] = (int) (Math.random() * SIZE);
        }

        startTime = System.currentTimeMillis();
        addTo(hashMap, arrayOfInteger);
        endTime = System.currentTimeMillis();
        System.out.println("Time for HashMap add: " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        addTo(treeMap, arrayOfInteger);
        endTime = System.currentTimeMillis();
        System.out.println("Time for TreeMap add: " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        find(hashMap, 4545);
        endTime = System.currentTimeMillis();
        System.out.println("Time for HashMap find: " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        find(treeMap, 4545);
        endTime = System.currentTimeMillis();
        System.out.println("Time for TreeMap find: " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        removeOf(hashMap, arrayOfInteger);
        endTime = System.currentTimeMillis();
        System.out.println("Time for HashMap remove: " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        removeOf(treeMap, arrayOfInteger);
        endTime = System.currentTimeMillis();
        System.out.println("Time for TreeMap remove: " + (endTime - startTime));


    }

    private static void addTo(Map<Integer, Integer> map, Integer[] arrayOfInteger) {
        for (int i = 0; i < SIZE; i++) {
            map.put(i, arrayOfInteger[i]);
        }
    }

    private static void removeOf(Map<Integer, Integer> map, Integer[] arrayOfInteger) {
        for (int i = 0; i < SIZE; i++) {
            map.remove(i, arrayOfInteger[i]);
        }
    }

    private static void find(Map<Integer, Integer> map, int s){
        for (int i = 0; i < map.size(); i++)
        {
            if (map.containsValue(s))
            {
                System.out.println(map.get(i));
                break;
            }
        }
    }
}
