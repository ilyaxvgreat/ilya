package Lesson1;

import java.util.Scanner;

public class Input {

    private int number;

    public int getNumber() {
        return number;
    }

    private void setNumber(int number) {
        this.number = number;
    }

    public void inputNumber() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter seconds quantity ");
        while (!scn.hasNextInt()) {
            System.out.println("Input int");
            scn.next(); // this is important!
        }
        setNumber(scn.nextInt());
    }
}
