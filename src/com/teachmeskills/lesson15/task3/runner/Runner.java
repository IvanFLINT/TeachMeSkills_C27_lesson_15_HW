package com.teachmeskills.lesson15.task3.runner;

import com.teachmeskills.lesson15.task3.inputService.InputService;
import com.teachmeskills.lesson15.task3.outputService.GetArrey;

import java.util.Scanner;

/**
 * The Runner class calls the arithmetical Mean method in its main method. Implemented an input error exception.
 */
public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            GetArrey.arithmeticalMean(InputService.inputService(sc));
        } catch (Exception e) {
            System.out.println("Input Error.");
        }
    }
}

