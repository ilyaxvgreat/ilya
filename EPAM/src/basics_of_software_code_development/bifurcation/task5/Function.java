package basics_of_software_code_development.bifurcation.task5;

public class Function {
    private int x;

    public Function(int x) {
        this.x = x;

        if (x <= 3) {
            System.out.println(x * x - 3 * x + 9);
        } else {
            try {
                double result = 1 / (x * x * x + 6);
                System.out.println( result );
            } catch (ArithmeticException e) {
                System.out.println("Деление на ноль");
            }
        }
    }
}
