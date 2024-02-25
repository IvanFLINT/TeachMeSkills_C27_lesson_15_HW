package com.teachmeskills.lesson15.task1.inputService;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The InputService class contains a getIntList method for entering data into the list. Converts string data to integers.
 */
public class InputService {
    public static ArrayList<Integer> getIntList(Scanner sc) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        String variable;
        do {
            System.out.print("Введите число: ");
            variable = sc.nextLine();
            if (variable.equals("exit")) {
                break;
            } else {
                try {
                    int val = Integer.valueOf(variable);
                    list.add(val);
                } catch (Exception e) {
                    System.out.println("Ввели некорректные данные");
                    list.add(0);
                }
            }
        } while (!variable.equals("exit"));
        return list;
    }
}
