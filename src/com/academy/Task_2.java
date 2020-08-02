package com.academy;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        ArrayList<String> someList = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String param = " ";
        while (true){
            System.out.print("If \"stop\" will be entered, program will be closed. Enter somebody: ");
            param = in.nextLine();
            if (param.equals("stop")){
                break;
            }
            someList.add(param);
        }
        for (String text : someList) {
            System.out.println(text);
        }

    }
}
