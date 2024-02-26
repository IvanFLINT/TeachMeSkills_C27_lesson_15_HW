package com.teachmeskills.lesson15.task4.service;

import com.teachmeskills.lesson15.task4.constant.C27onlGroup;

import java.io.*;
import java.util.*;

public class Service {

    public static void abc() throws IOException {
        Set<String> st = new HashSet<>();
        File dir = new File(C27onlGroup.GROUP);
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(dir));
        } catch (Exception e) {
            System.out.println("File does not exist");
        }
        String list;
        while ((list = br.readLine()) != null) {
            st.add(list);
        }
        for (String strings : st){
            System.out.println(strings);
        }
    }
}

