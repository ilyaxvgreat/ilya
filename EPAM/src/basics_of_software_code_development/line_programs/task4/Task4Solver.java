package basics_of_software_code_development.line_programs.task4;

import java.text.DecimalFormat;

public class Task4Solver {
    public String solver(Task4 number) {
        double nnn_ddd = number.getNumber();
        int nnn = (int) nnn_ddd;
        double ddd = (nnn_ddd - nnn)*1000;

        double result = ddd + (double)nnn/1000;
        DecimalFormat decimalFormat = new DecimalFormat("#000.000");

        return decimalFormat.format(result);
    }
}
