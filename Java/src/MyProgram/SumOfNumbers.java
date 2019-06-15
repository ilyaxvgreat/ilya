package MyProgram.Work;

import java.util.Scanner;

public class SumOfNumbers {

    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void inputNumber() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter int number for calculating sum ");
        while (!scn.hasNextInt()) {
            System.out.println("Input int");
            scn.next(); // this is important!
        }
        setNumber(scn.nextInt());
    }

    public void sumOfNumbers() {
        int num = getNumber();
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("число " + getNumber() + " сумма " + sum);
//        for (int i = 1; i <= number; i++) {
//            sum += i % 10 + i / 10;
//            sum += a;
//            sum += (a % 10 + a / 10);
//            System.out.println("число " + i + " сумма " + sum);
//        }
    }
}
