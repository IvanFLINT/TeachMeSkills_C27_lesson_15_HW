package com.teachmeskills.lesson15.task1.runner;

import com.teachmeskills.lesson15.task1.inputService.InputService;
import com.teachmeskills.lesson15.task1.outputService.PrintEaven;

import java.util.Scanner;

/**
 * The Runner class calls the getIntList method from the InputService class
 */
public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintEaven.validator(InputService.getIntList(sc));
        sc.close();
    }
}
