package basics_of_software_code_development.celces.task8;

import java.util.ArrayList;

public class SameNumerals {
    public String comparisonOfNumbers(int a, int b) {
        String result = "";
        ArrayList<Integer> aNum = new ArrayList<>();
        while (a > 0) {
            aNum.add(a % 10);
            a /= 10;
        }

        ArrayList<Integer> bNum = new ArrayList<>();
        while (b > 0) {
            bNum.add(b % 10);
            b /= 10;
        }

        for (Integer integerA : aNum) {
            for (Integer integerB : bNum) {
                if (integerA.equals(integerB)){
                    result+=integerA + " " ;
                }
            }
        }
        return result;
    }
}
