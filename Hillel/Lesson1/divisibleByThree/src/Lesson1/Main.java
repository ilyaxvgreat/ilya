package Lesson1;

public class Main {

    public static void main(String[] args) {
        SumOfNumbers sumOfNumbers = new SumOfNumbers();
        sumOfNumbers.inputNumber();
        DivisibleByThree divisibleByThree = new DivisibleByThree();
        divisibleByThree.divisibleByThree(sumOfNumbers.sumOfNumbers());
        divisibleByThree.printOut(sumOfNumbers.getNumber());
    }
}
