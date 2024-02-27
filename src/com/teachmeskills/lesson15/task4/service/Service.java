package com.teachmeskills.lesson15.task4.service;

import com.teachmeskills.lesson15.task4.constant.C27onlGroup;

import java.io.*;
import java.util.*;

/**
 * The Service class consists of a service method that processes the file and outputs information to the console
 */
public class Service {

    public static void service(){
        Set<String> st = new HashSet<>();
        File dir = new File(C27onlGroup.GROUP);
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(dir));
        } catch (Exception e) {
            System.out.println("File does not exist");
        }
        String list;
        while (true) {
            try {
                if (!((list = br.readLine()) != null)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            st.add(list);
        }
        for (String strings : st) {
            System.out.println(strings);
        }
    }
}

