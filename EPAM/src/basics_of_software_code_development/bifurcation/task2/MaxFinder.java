package basics_of_software_code_development.bifurcation.task2;

public class MaxFinder {
    public int solution(Numbers numbers) {
        int a = numbers.getA();
        int b = numbers.getB();
        int c = numbers.getC();
        int d = numbers.getD();

        if (a != 0 && b != 0 && c != 0 && d != 0) {
            int minAB = Math.min(a, b);
            int minCD = Math.min(c, d);
            return Math.max(minAB,minCD);
        }
        return 0;
    }
}
