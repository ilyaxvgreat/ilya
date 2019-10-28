package basics_of_software_code_development.celces.task5;

public class NumberSeries {

    public double commonMemberNum(int numIndex) {
        double result;
        result = (1 / Math.pow(2, numIndex)) - (1 / Math.pow(3, numIndex));
        return result;
    }
}
