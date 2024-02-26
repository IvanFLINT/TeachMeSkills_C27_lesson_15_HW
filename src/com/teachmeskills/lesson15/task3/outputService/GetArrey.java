package com.teachmeskills.lesson15.task3.outputService;

import java.util.ArrayList;

/**
 * The GetArrey class has an arithmeticalMean method that takes an ArrayList<Integer> as input.
 * Calculates the arithmetic mean of the elements of a list.
 */
public class GetArrey {
    public static void arithmeticalMean(ArrayList<Integer> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += Integer.parseInt(String.valueOf(list.get(i)));
        }
        System.out.printf("Cреднее арифметическое: %.3f", sum / list.size());
    }
}
