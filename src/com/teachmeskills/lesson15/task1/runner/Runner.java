package com.teachmeskills.lesson15.task1.runner;

import com.teachmeskills.lesson15.task1.service.Service;
import com.teachmeskills.lesson15.task1.validation.Validator;

import java.util.Scanner;

/**
 * The Runner class calls the validator method from the Validator class
 */
public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Validator.validator(Service.service(sc));
        sc.close();
    }
}
