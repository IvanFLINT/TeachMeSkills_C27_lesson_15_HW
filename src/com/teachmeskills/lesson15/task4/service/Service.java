package com.teachmeskills.lesson15.task4.service;

import com.teachmeskills.lesson15.task4.constant.C27onlGroup;

import java.io.*;
import java.util.*;

public class Service {

    public static String abc() throws IOException {
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
            System.out.println(list);
        }
        return list;
    }
}

