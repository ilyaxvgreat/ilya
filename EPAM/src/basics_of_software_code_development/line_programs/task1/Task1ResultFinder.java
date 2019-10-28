package basics_of_software_code_development.line_programs.task1;

public class Task1ResultFinder {

    public double task1Calculation(Task1 numbers){
        double result;

        result = ((numbers.getA()-3)*numbers.getB()/2)+numbers.getC();

        return result;
    }
}
