package basics_of_software_code_development.celces.task1;

public class NumSum {
    private int num;

    public NumSum(int num) {
        this.num = num;
    }

    public int sumCalculationFromOneToNum() {
        int num = this.num;
        int sum = 0;
        for (int i = 1; i < num + 1; i++) {
            sum += i;
        }
        return sum;
    }
}
