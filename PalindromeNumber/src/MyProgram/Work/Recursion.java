package MyProgram.Work;

public class Recursion {
    public static void main(String[] args) {
        counter(3);
        System.out.println(factorial(5)) ;
    }

    private static void counter(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        counter(n - 1);
    }

    private static int factorial(int f) {
        if (f == 1)
            return 1;
        return f * factorial(f - 1);
    }
}
