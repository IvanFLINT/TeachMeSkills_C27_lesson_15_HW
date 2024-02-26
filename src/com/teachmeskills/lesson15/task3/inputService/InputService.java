package com.teachmeskills.lesson15.task3.inputService;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * The InputService class has a method inputService that takes the Scanner class as input.
 * Creates a list and fills it with random numbers. The output is ArrayList<Integer>
 */
public class InputService {
    public static ArrayList<Integer> inputService(Scanner sc) {
        Random ran = new Random();
        System.out.print("Размер списка: ");
        int dimension = sc.nextInt();
        List<Integer> list = new ArrayList<>(dimension);
        while (list.size() <= dimension) {
            list.add(ran.nextInt(100));
        }
        System.out.println(list);
        return (ArrayList<Integer>) list;
    }
}
