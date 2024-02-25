package com.teachmeskills.lesson15.task2.figure;

/**
 * The Square class contains the perimeterCalculation method, which is inherited from the abstract Figure class.
 * Contains fields with variables for calculating the perimeter
 */
public class Square extends Figure{
    private double a;
    private double p;

    public Square(double a) {
        this.a = a;
    }
    @Override
    public String perimeterCalculation() {
        p = 4 * a;
        return "Периметр прямоугольника: " + p;
    }
}
