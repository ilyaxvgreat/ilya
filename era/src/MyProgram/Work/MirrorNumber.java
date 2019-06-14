package MyProgram.Work;

import java.util.Scanner;

public class MirrorNumber {

    private int inputNumber;

    public int getInputNumber() {
        return inputNumber;
    }

    public void setInputNumber(int inputNumber) {
        this.inputNumber = inputNumber;
    }

    public void inputNumber() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter int number");
        while (!scn.hasNextInt()) {
            System.out.println("Input int");
            scn.next(); // this is important!
        }
        setInputNumber(scn.nextInt());
    }

    public void mirror() {
        int num = getInputNumber();
        int mirror = 0;
        while (num != 0) {
            mirror = mirror * 10 + (num % 10);
            num = num / 10;
        }
//        while (num != 0) {
//            mirror = mirror * 10 + (num % 10);
//            num = num / 10;
//        }
        System.out.println("Ваше число: " + getInputNumber());
        System.out.println("Зеркально: " + mirror);
    }

    public void numberQnt() {
        int num = getInputNumber();
        int qnt = 0;
        while (num != 0) {
            num = num / 10;
            qnt++;
        }
        System.out.println("Количество цифр: " + qnt);
    }
}
