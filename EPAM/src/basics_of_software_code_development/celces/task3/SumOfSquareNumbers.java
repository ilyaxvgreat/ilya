package basics_of_software_code_development.celces.task3;

import java.util.ArrayList;

public class SumOfSquareNumbers {
    public int sumOfSquares(ArrayList<Integer> nums) {
        int sum = 0;
        for (Integer num : nums) {
            sum+=num*num;
        }
        return sum;
    }
}
