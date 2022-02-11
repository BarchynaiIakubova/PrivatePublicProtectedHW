package com.company;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(2.5);
        System.out.println("Area of the circle is equal to " + Circle.area());
        Circle.circumference();
    }
}
