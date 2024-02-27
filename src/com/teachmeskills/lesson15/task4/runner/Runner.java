package com.teachmeskills.lesson15.task4.runner;

import com.teachmeskills.lesson15.task4.service.Service;

import java.io.IOException;

/**
 * The Runner class in the main method calls the service method to process the list
 */
public class Runner {
    public static void main(String[] args) throws IOException {
        try {
            Service.service();
        }catch (Exception e){
            System.out.println("File not found");
        }
    }
}
