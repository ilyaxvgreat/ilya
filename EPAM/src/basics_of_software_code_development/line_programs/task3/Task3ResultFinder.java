package basics_of_software_code_development.line_programs.task3;

public class Task3ResultFinder {
    public double task3Calculation(Task3 numbers) {
        double result = 0;
        try {
            result = (Math.sin(numbers.getX()) + Math.cos(numbers.getY())) * Math.tan(numbers.getX() * numbers.getY()) /
                    (Math.cos(numbers.getX()) - Math.sin(numbers.getY()));
        }catch (ArithmeticException e){
            System.out.println("Деление на 0");
        }
        return result;
    }
}
