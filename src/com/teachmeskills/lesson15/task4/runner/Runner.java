package com.teachmeskills.lesson15.task4.runner;

import com.teachmeskills.lesson15.task4.constant.C27onlGroup;
import com.teachmeskills.lesson15.task4.service.Service;

import java.util.List;
import java.util.Set;

public class Runner {
    public static void main(String[] args) {
        List<String> list = C27onlGroup.GROUP;
        Set<String> set = Service.service(list);
    }
}
