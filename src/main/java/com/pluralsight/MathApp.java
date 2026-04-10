package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
//  Step 1
//  Write code to find answers to the questions on the following page.
//  1.1
        double garySalary = 2987.10;
        double bobSalary = 1878.98;
        double highestSalary = Math.max(bobSalary,garySalary);

        System.out.printf("The highest salary is: %.2f.%n%n", highestSalary);
//  1.2
        double truckPrice = 48000.00;
        double carPrice = 18000.00;
        double smallestPrice = Math.min(truckPrice, carPrice);

        System.out.printf("The smallest price is: %.2f.%n%n", smallestPrice);

//  1.3
        double radius = Math.PI;
        double circleArea = Math.pow(radius, 2) * radius;

        System.out.printf("The area of the circle is: %.2f.%n%n", circleArea);

    }
}
