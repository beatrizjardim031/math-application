package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
//        Step 1
//        Write code to find answers to the questions on the following page.

        double garySalary = 2987.10;
        double bobSalary = 1878.98;
        double highestSalary = Math.max(bobSalary,garySalary);

        System.out.printf("The highest salary is: %.2f.%n%n", highestSalary);


    }
}
