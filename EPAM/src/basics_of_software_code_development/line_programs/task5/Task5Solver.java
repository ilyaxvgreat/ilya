package basics_of_software_code_development.line_programs.task5;

public class Task5Solver {
    public String timeCalculation (Task5 seconds){
        String result;
        int time = seconds.getSecondsQnt();
        int hh,mm,ss;
        hh = time/3600;
        time -= hh*3600;
        mm = time/60;
        time -=mm*60;
        ss = time;
        result = hh + "ч " + mm + "мин " + ss + "c";
        return result;
    }
}
