package basics_of_software_code_development.celces.task2;

import java.util.*;

public class Function2 {

    public Map calculation(NumbersFromAToBWithStepH numbersFromAToBWithStepH) {
        int a = numbersFromAToBWithStepH.getA();
        int b = numbersFromAToBWithStepH.getB();
        int step = numbersFromAToBWithStepH.getStep();

        Map<Integer, Integer> functionResults = new HashMap<>();

        for (int i = a; a < b; a += step) {
            if (i <= 2) {
                functionResults.put(a, -a);
            } else {
                functionResults.put(a, a);
            }
        }
        return functionResults;
    }
}
