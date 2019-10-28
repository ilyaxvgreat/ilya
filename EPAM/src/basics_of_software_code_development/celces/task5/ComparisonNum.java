package basics_of_software_code_development.celces.task5;

public class ComparisonNum {
//    private double a;

//    public ComparisonNum(double a) {
//        this.a = a;
//    }

    public Double comparison(NumberSeries numberSeries, double a) {
        int n =1;
        double series ;
        for (int i = 0; i<n ; i++) {

            series = Math.abs(numberSeries.commonMemberNum(i - 1) +
                    numberSeries.commonMemberNum(i) +
                    numberSeries.commonMemberNum(i + 1));
            if (series > a || series == a){
                return series;
            }
            n++;
        }
        return null;
    }

//    public double getA() {
//        return a;
//    }
}
