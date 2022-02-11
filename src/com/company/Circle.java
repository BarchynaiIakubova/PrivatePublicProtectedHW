package com.company;

public class Circle {
    private static final double pi = 3.14;
    private static double radius;
    public Circle() {

    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public static double getPi() {
        return pi;
    }

    public static double getRadius() {
        return radius;
    }

    public static void setRadius(double radius) {
        Circle.radius = radius;
    }

    static double area() {
        double area = pi * (radius * radius);
        return area;
    }
    static void circumference() {
        double circumference = pi * 2 * radius;
        System.out.println("Circumference of the circle is equal to " + circumference);
    }
}
