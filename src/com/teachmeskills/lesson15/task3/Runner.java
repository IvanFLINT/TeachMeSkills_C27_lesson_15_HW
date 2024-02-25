package com.teachmeskills.lesson15.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Размер списка: ");
        int dimension = sc.nextInt();
        List<Integer> list = new ArrayList<>(dimension);
        while (list.size() <= dimension) {
            list.add(ran.nextInt(100));
        }
        System.out.println(list);
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += Integer.parseInt(String.valueOf(list.get(i)));
        }
        System.out.printf("Cреднее арифметическое: \"%.3f\"" , sum / list.size());
    }
}

