package com.academy;

import java.util.ArrayDeque;
import java.util.Queue;

public class Task_3 {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>(20);
        for (int i = 1; i < 11; i++) {
            queue.add(i);
        }
        printQueue(queue);
        Integer elementToFind = 1;
        Integer user1;
        Integer user2;
        int i = 1;
        do {
            if (i / 2 == 0) {
                user1 = queue.remove();
                if (user1.equals(elementToFind)) {
                    System.out.println("User1 is winner");
                    return;
                }
            } else {
                user2 = queue.remove();
                if (user2.equals(elementToFind)) {
                    System.out.println("User2 is winner");
                    return;
                }
            }
            i++;
        } while (i <= 10);
    }

    private static void printQueue(Queue queue) {
        System.out.print("Queue: ");
        queue.forEach(obj -> System.out.print(obj + " "));
        System.out.println();
    }
}
