package basics_of_software_code_development;

import basics_of_software_code_development.bifurcation.task1.Solution;
import basics_of_software_code_development.bifurcation.task1.Triangle;
import basics_of_software_code_development.bifurcation.task2.MaxFinder;
import basics_of_software_code_development.bifurcation.task2.Numbers;
import basics_of_software_code_development.bifurcation.task3.IsPointsOnLine;
import basics_of_software_code_development.bifurcation.task3.PointXY;
import basics_of_software_code_development.bifurcation.task4.Brick;
import basics_of_software_code_development.bifurcation.task4.Hole;
import basics_of_software_code_development.bifurcation.task4.IsBrickPassHole;
import basics_of_software_code_development.bifurcation.task5.Function;
import basics_of_software_code_development.celces.task1.InputNum;
import basics_of_software_code_development.celces.task1.NumSum;
import basics_of_software_code_development.celces.task2.Function2;
import basics_of_software_code_development.celces.task2.NumbersFromAToBWithStepH;
import basics_of_software_code_development.celces.task3.NumbersFromOneToA;
import basics_of_software_code_development.celces.task3.SumOfSquareNumbers;
import basics_of_software_code_development.celces.task5.ComparisonNum;
import basics_of_software_code_development.celces.task5.NumberSeries;
import basics_of_software_code_development.celces.task7.DividerFinder;
import basics_of_software_code_development.celces.task8.SameNumerals;
import basics_of_software_code_development.celces.task8.TwoNumbers;
import basics_of_software_code_development.line_programs.task1.*;
import basics_of_software_code_development.line_programs.task2.*;
import basics_of_software_code_development.line_programs.task3.*;
import basics_of_software_code_development.line_programs.task4.Task4;
import basics_of_software_code_development.line_programs.task4.Task4Solver;
import basics_of_software_code_development.line_programs.task5.Task5;
import basics_of_software_code_development.line_programs.task5.Task5Solver;
import basics_of_software_code_development.line_programs.task6.Task6;
import basics_of_software_code_development.line_programs.task6.Task6Solver;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Task1 test1 = new Task1(1, 2, 3);
        Task1ResultFinder task1ResultFinder = new Task1ResultFinder();
        System.out.println(task1ResultFinder.task1Calculation(test1));

        Task2ResultFinder task2ResultFinder = new Task2ResultFinder();
        System.out.println(task2ResultFinder.task2Calculation(new Task2(1.25, 1.78, 6.55)));

        Task3 test3 = new Task3(5.78, 6.25);
        Task3ResultFinder task3ResultFinder = new Task3ResultFinder();
        double test3Result = task3ResultFinder.task3Calculation(test3);
        System.out.println(test3Result);

        Task4 test4 = new Task4(123.456);
        Task4Solver task4Solver = new Task4Solver();
        System.out.println(task4Solver.solver(test4));

        Task5 test5 = new Task5(123456789);
        Task5Solver task5Solver = new Task5Solver();
        System.out.println(task5Solver.timeCalculation(test5));

        Task6 test6 = new Task6(4, 1);
        Task6Solver task6Solver = new Task6Solver();
        System.out.println(task6Solver.solver(test6));

        Triangle triangle = new Triangle(90, 45, 45);
        Solution solution = new Solution();
        System.out.println(solution.isTriangle(triangle));
        System.out.println(solution.isTriangleRight(triangle));

        Numbers numbers = new Numbers(2, 1, 1, 4);
        MaxFinder maxFinder = new MaxFinder();
        System.out.println(maxFinder.solution(numbers));

        PointXY point1 = new PointXY(1, 1);
        PointXY point2 = new PointXY(2, 2);
        PointXY point3 = new PointXY(3, 4);
        IsPointsOnLine isPointsOnLine = new IsPointsOnLine();
        System.out.println("точки " + isPointsOnLine.solution(point1, point2, point3));

        Brick brick = new Brick(1,2,3);
        Hole hole = new Hole(2,1);
        IsBrickPassHole isBrickPassHole = new IsBrickPassHole(brick,hole);
        System.out.println("дыра кирпич " + isBrickPassHole.IsBrickPassHole());

        Function function = new Function(4);

        InputNum inputNum = new InputNum();
        int num=0;
        while(num<1){
            System.out.println("Введите положительное число");
            num = inputNum.input();
        }
        NumSum sumOfSquares = new NumSum(num);
        System.out.println(sumOfSquares.sumCalculationFromOneToNum());

        NumbersFromAToBWithStepH numbersFromAToBWithStepH = new NumbersFromAToBWithStepH(-10,10,3);
        Function2 function2 = new Function2();
        System.out.println("function " + "\n" + function2.calculation(numbersFromAToBWithStepH));

        NumbersFromOneToA nums100 = new NumbersFromOneToA();
        ArrayList<Integer> integerArrayList100 = nums100.FirstOneHundredIntNums(100);
        SumOfSquareNumbers sumOfNumbers = new SumOfSquareNumbers();
        System.out.println(sumOfNumbers.sumOfSquares(integerArrayList100));

        NumbersFromOneToA nums200 = new NumbersFromOneToA();
        ArrayList<Integer> integerArrayList200 = nums200.FirstOneHundredIntNums(200);
        System.out.println(sumOfNumbers.sumOfSquares(integerArrayList200));

        NumberSeries numberSeries = new NumberSeries();
        ComparisonNum comparisonNum = new ComparisonNum();
        System.out.println(comparisonNum.comparison(numberSeries,-1));

        TwoNumbers twoNumbers = new TwoNumbers(6,25);
        DividerFinder finder = new DividerFinder();
        System.out.println(finder.findDivider(twoNumbers.getA(),twoNumbers.getB()));

        TwoNumbers twoNumbers1 = new TwoNumbers(1234,1234);
        SameNumerals sameNumerals = new SameNumerals();
        System.out.println(sameNumerals.comparisonOfNumbers(twoNumbers1.getA(),twoNumbers1.getB()));
    }
}
