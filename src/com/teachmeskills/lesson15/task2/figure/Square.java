package com.teachmeskills.lesson15.task2.figure;

public class Square extends Figure{

    double a;
    public double p;

    public Square(double a) {
        this.a = a;
    }
    @Override
    public String perimeterCalculation() {
        p = 4 * a;
        return "Периметр прямоугольника: " + p;
    }
}
