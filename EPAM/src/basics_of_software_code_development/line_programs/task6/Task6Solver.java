package basics_of_software_code_development.line_programs.task6;

public class Task6Solver {
    public boolean solver(Task6 params) {
        int x = params.getX();
        int y = params.getY();
        if (x >= -4 && x <= 4 && y >= -3 && y<=0)
            return true;
        if (x>=-2 && x<=2 && y>=0&&y<=4){
            return true;
        }
        return false;
    }
}
