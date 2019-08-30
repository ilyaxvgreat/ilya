package Lesson1;

public class Main {

    public static void main(String[] args) {
        Input input = new Input();
        input.inputNumber();
        FormatDuration formatDuration = new FormatDuration();
        formatDuration.setNumber(input.getNumber());
        formatDuration.printOutResult();
    }
}
