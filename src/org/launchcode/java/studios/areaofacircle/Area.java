package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        while (true) {
        Double radius;
        Double area;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius (or enter 0 to exit): ");

        if (!input.hasNext() || !input.hasNextDouble()) {
            System.out.println("Try again! Radius must be a number");
        } else {
            radius = input.nextDouble();
            if (radius < 0) {
                System.out.println("Try again! Radius must be a positive number");
            } else if (radius == 0) {
                System.out.println("Goodbye!");
                input.close();
                break;
            } else {
                area = Circle.getArea(radius);
                System.out.println("The area of a circle of radius " + radius + " is " + area);
            }

        }
        }
    }
}
