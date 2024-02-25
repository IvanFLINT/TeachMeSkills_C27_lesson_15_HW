package com.teachmeskills.lesson15.task2.figure;

public class Circle extends Figure{
    private double r;
    private double p;
    final private double PI = 3.14;

    public Circle(double r) {
        this.r = r;
    }
    @Override
    public String perimeterCalculation() {
        p = 2 * PI * r;
        return "Периметр окружности: " + p;
    }
}
