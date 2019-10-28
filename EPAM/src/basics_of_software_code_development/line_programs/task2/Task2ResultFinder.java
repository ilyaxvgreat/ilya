package basics_of_software_code_development.line_programs.task2;

public class Task2ResultFinder {

    public double task2Calculation(Task2 numbers){
        double result = 0;
        try {
            result = ((numbers.getB()+Math.sqrt(Math.pow(numbers.getB(),2)+4* numbers.getA()* numbers.getC()))/
                    (2* numbers.getA()))- Math.pow(numbers.getA(),3)* numbers.getC()+Math.pow(numbers.getB(),-2);
        }catch (ArithmeticException e){
            System.out.println("Деление на ноль");
        }
        return result;
    }
}
