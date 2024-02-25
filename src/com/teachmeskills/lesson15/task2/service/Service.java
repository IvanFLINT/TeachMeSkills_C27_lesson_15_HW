package com.teachmeskills.lesson15.task2.service;

import com.teachmeskills.lesson15.task2.figure.Circle;
import com.teachmeskills.lesson15.task2.figure.Rectangle;
import com.teachmeskills.lesson15.task2.figure.Square;

import java.util.ArrayList;
import java.util.List;

/**
 * The Service class contains a service method that creates shape objects and displays the result of the methods in a list.
 */
public class Service {
    public static void service(){
        Circle cir = new Circle(12);
        Rectangle rec = new Rectangle(12,14);
        Square sq = new Square(4);
        List<String> list = new ArrayList<>();
        list.add(cir.perimeterCalculation());
        list.add(rec.perimeterCalculation());
        list.add(sq.perimeterCalculation());
        for(String st : list){
            System.out.println(st);
        }
    }
}
