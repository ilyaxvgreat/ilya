package basics_of_software_code_development.celces.task3;

import java.util.ArrayList;

public class NumbersFromOneToA {

    public ArrayList<Integer> FirstOneHundredIntNums(int num) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            nums.add(i);
        }
        return nums;
    }
}
