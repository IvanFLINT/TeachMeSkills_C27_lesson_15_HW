package com.teachmeskills.lesson15.task1.validator;

import com.teachmeskills.lesson15.task1.service.Service;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The Validator class contains a validator method for finding even numbers in a list.
 */
public class Validator {
    public static void validator(ArrayList<Integer> sc) {
        for (int i : sc) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
