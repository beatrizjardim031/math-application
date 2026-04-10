package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
//  Step 1
//  Write code to find answers to the questions on the following page.
//  1.1
        double garySalary = 2987.10;
        double bobSalary = 1878.98;
        double highestSalary = Math.max(bobSalary,garySalary);

        System.out.printf("The highest salary is: $%.2f.%n%n", highestSalary);
//  1.2
        double truckPrice = 48000.00;
        double carPrice = 18000.00;
        double smallestPrice = Math.min(truckPrice, carPrice);

        System.out.printf("The smallest price is: $%.2f.%n%n", smallestPrice);

//  1.3
        double radius = 7.25;
        double circleArea = Math.pow(radius, 2) * Math.PI;

        System.out.printf("The area of the circle is: %.2f.%n%n", circleArea);

//  1.4
        double number = 5.0;
        double squareRoot = Math.sqrt(number);

        System.out.printf("The square root of 5 is: %.2f.%n%n", squareRoot);

//  1.5
        double distance = Math.sqrt(Math.pow(85-5, 2) + Math.pow(50-10, 2));

        System.out.printf("The distance is: %.2f.%n%n", distance);

//  1.6
        double absolute = Math.abs(-3.8);

        System.out.printf("The absolute is: %.1f.%n%n", absolute);

//  1.7
        double randomNumber = Math.random();

        System.out.printf("Your random number is: %.2f.%n%n", randomNumber);

//  1.8
        int hourMin = 60;
        int dayHours = 24;
        int days = 24;
        int totalMin = dayHours * hourMin * days;

        System.out.printf("24 days have: %d minutes.%n%n", totalMin);


    }
}
