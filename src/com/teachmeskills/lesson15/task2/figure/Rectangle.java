package com.teachmeskills.lesson15.task2.figure;

public class Rectangle extends Figure{

    private double a, b;
    private double p;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public String perimeterCalculation() {
        p = a + a + b + b;
        return "Периметр прямоугольника: " + p;
    }
}
