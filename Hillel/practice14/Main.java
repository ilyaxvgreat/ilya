package practice14;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //task 1
        try (PrintWriter writer = new PrintWriter(
                new FileOutputStream("text.txt"))) {
            writer.println("Hello, world!");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        secondTask();

        try {
            thirdTask();
        } catch (IOException e) {
            System.out.println("file not found");
        }

        fourthTask();
        fifthTask();

    }

    static void secondTask() {
        try (PrintWriter writer = new PrintWriter(
                new FileOutputStream("random.txt"))) {
            for (int i = 0; i < 1000; i++) {
                writer.print((int) (Math.random() * (1150 + 1) - 500) + ",");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    static void thirdTask() throws IOException {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        try (FileReader reader = new FileReader(
                "random.txt");
             Scanner scanner = new Scanner(reader)) {
            scanner.useDelimiter(",");
            while (scanner.hasNext() && integerArrayList.size() < 100) {
                integerArrayList.add(scanner.nextInt());
            }

        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }
        int count = 0;
        int sum = 0;
        for (Integer integer : integerArrayList) {
            if (integer > 0) {
                count++;
                sum += integer;
            }
        }
        try {
            System.out.println(" среднее значение прочитаннýх положителþнýх чисел = " + sum / count);
        } catch (ArithmeticException e) {
            System.out.println("деление на 0");
        }
    }

    static void fifthTask() {
        ArrayList<Person> personArrayList = new ArrayList<>();

        try (
                FileReader reader = new FileReader("peoples.txt");
                Scanner scanner = new Scanner(reader)
        ) {
            scanner.useDelimiter("/");
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                personArrayList.add(parseLine(line));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Person person : personArrayList) {
            System.out.println(person);
        }
    }

    public static Person parseLine(String line) {
        Scanner scanner = new Scanner(line);
        scanner.useDelimiter("/");
        while (scanner.hasNext()) {
            String name = scanner.next();
            String gender = scanner.next();
            String age = scanner.next();
            return new Person(name, gender, age);
        }
        return null;
    }

    static void fourthTask() {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> lastNames = new ArrayList<>();
        ArrayList<Integer> mobNum = new ArrayList<>();
        names.add("aksdfm");
        lastNames.add("oeiirg");
        mobNum.add(19232);
        names.add("opoiads");
        lastNames.add("alsknv");
        mobNum.add(974720);
        names.add("xmvb");
        lastNames.add("mwwm");
        mobNum.add(12774);
        names.add("qpw");
        lastNames.add("mvmsdq[[");
        mobNum.add(12883882);
        names.add("leinv");
        lastNames.add("ghueu");
        mobNum.add(3546868);
        names.add("adqweddfm");
        lastNames.add("qnvndu");
        mobNum.add(29387);
        names.add("mvmod");
        lastNames.add("snhhf");
        mobNum.add(918273);
        names.add("asdfkvni");
        lastNames.add("nnusuu");
        mobNum.add(265362);
        names.add("asdfkvni");
        lastNames.add("nnusuu");
        mobNum.add(265362);
        names.add("asdfkvni");
        lastNames.add("nnusuu");
        mobNum.add(265362);
        names.add("asdfkvni");
        lastNames.add("nnusuu");
        mobNum.add(265362);

        try (PrintWriter writer = new PrintWriter(
                new FileOutputStream("peoples.txt"))) {
            for (int i = 0; i < 10; i++) {
                writer.print(names.get(i) + "/" + lastNames.get(i) + "/" + mobNum.get(i) + "/" + "\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

    }
}
