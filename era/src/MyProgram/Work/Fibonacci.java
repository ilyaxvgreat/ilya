package MyProgram.Work;

import java.util.Scanner;

public class Fibonacci {
    private int inputNumber;
    private int fib0 = 0;
    private int fib1 = 1;
    private int fib2;

    public int getFib0() {
        return fib0;
    }

    public void setFib0(int fib0) {
        this.fib0 = fib0;
    }

    public int getFib1() {
        return fib1;
    }

    public void setFib1(int fib1) {
        this.fib1 = fib1;
    }

    public int getFib2() {
        return fib2;
    }

    public void setFib2(int fib2) {
        this.fib2 = fib2;
    }

    public int getInputNumber() {
        return inputNumber;
    }

    public void setInputNumber(int inputNumber) {
        this.inputNumber = inputNumber;
    }

    public void inputNumber() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter quantity for Fibonacci ");
        while (!scn.hasNextInt()) {
            System.out.println("Input int");
            scn.next(); // this is important!
        }
        setInputNumber(scn.nextInt());
    }

    public void fibonacci() {
        int fibQnt = getInputNumber();
        for (int i = 1; i < fibQnt; i++) {
            setFib2(getFib0() + getFib1());
            System.out.println(i + " " + fib2);
            setFib0(getFib1());
            setFib1(getFib2());
        }

    }
}
