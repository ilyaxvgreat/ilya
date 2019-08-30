package Lesson1;

public class DivisibleByThree {

    private boolean result;

    public boolean getResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public void divisibleByThree(int sum) {
        if (sum % 3 == 0) {
            setResult(true);
        } else {
            setResult(false);
        }
    }

    public void printOut(int num) {
        if (getResult()) {
            System.out.println(num + " true");
        } else {
            System.out.println(num + " false");
        }
    }
}
