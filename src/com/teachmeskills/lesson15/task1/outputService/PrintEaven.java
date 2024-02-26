package com.teachmeskills.lesson15.task1.outputService;

import java.util.ArrayList;

/**
 * The PrintEaven class contains a validator method for finding even numbers in a list.
 */
public class PrintEaven {
    public static void validator(ArrayList<Integer> sc) {
        for (int i : sc) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
