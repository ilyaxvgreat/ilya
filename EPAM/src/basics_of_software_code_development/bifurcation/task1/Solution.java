package basics_of_software_code_development.bifurcation.task1;

public class Solution {

    public boolean isTriangle(Triangle angles) {
        int ang1 = angles.getAng1();
        int ang2 = angles.getAng2();
        int ang3 = angles.getAng3();
        if (ang1 != 0 &&
                ang2 != 0 &&
                ang3 != 0 &&
                ang1 + ang2 + ang3 == 180) {
            return true;
        }
        return false;
    }

    public boolean isTriangleRight(Triangle angles) {
        if (isTriangle(angles)) {
            int ang1 = angles.getAng1();
            int ang2 = angles.getAng2();
            int ang3 = angles.getAng3();
            if (ang1 == 90 || ang2 == 90 || ang3 == 90) {
                return true;
            }
        }
        return false;
    }
}
