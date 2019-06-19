package com.company;

import java.util.Scanner;

public class Input {
    private int hour;
    private int min;

    public int getHour() {
        return hour;
    }

    public void setHour() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Hours");
        while (!scanner.hasNextInt()) {
            System.out.println("Error! Need int number");
            scanner.next();
        }
        hour = scanner.nextInt();
    }

    public int getMin() {
        return min;
    }

    public void setMin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Minutes");
        while (!scanner.hasNextInt()) {
            System.out.println("Error! Need int number");
            scanner.next();
        }
        min = scanner.nextInt();
    }
}
