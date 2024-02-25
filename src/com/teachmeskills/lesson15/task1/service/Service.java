package com.teachmeskills.lesson15.task1.service;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The Service class contains a service method for entering data into the list. Converts string data to integers.
 */
public class Service {
    public static ArrayList<Integer> service(Scanner sc){
        ArrayList<Integer> list = new ArrayList<Integer>();
        String var;
        do {
            System.out.print("Введите число: ");
            var = sc.nextLine();
            if (var.equals("exit")) {
                break;
            } else {
                try {
                    int val = Integer.valueOf(var);
                    list.add(val);
                }catch (Exception e){
                    System.out.println("Ввели некорректные данные");
                    list.add(0);
                }
            }
        } while (!var.equals("exit"));
        return list;
    }
}
