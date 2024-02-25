package com.teachmeskills.lesson15.task1.runner;

import com.teachmeskills.lesson15.task1.service.InputService;
import com.teachmeskills.lesson15.task1.OutputputService.PrintEaven;

import java.util.Scanner;

/**
 * The Runner class calls the validator method from the Validator class
 */
public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintEaven.validator(InputService.getIntList(sc));
        sc.close();
    }
}
