package basics_of_software_code_development.celces.task7;

import java.util.ArrayList;

public class DividerFinder {
    public ArrayList<Integer> findDivider(int num1, int num2) {
        ArrayList<Integer> result = new ArrayList<>();


        for (int i = num1; num1 <= num2; num1++) {
            for (int j = 2; j <= num2; j++) {
                if (num1 == j) {
                    continue;
                }
                if ((num1 % j) == 0) {
                    if (!result.contains(j)) {
                        result.add(j);
                    }
                }
            }
        }
        return result;
    }
}
