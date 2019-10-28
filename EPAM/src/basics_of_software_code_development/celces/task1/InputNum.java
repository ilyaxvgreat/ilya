package basics_of_software_code_development.celces.task1;

import java.util.Scanner;

public class InputNum {
    private int num;

    public int input() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num");
        while (!scanner.hasNextInt()) { //TODO добавить проверку на положительное число
            System.out.println("Error! Need int number");
            scanner.next();
        }
        num = scanner.nextInt();
        return num;
    }
}
