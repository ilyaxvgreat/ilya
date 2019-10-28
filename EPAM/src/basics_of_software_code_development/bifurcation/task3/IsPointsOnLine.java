package basics_of_software_code_development.bifurcation.task3;

public class IsPointsOnLine {
    public boolean solution(PointXY pointXY1,PointXY pointXY2,PointXY pointXY3){
        int pointX1 = pointXY1.getX();
        int pointY1 = pointXY1.getY();

        int pointX2 = pointXY2.getX();
        int pointY2 = pointXY2.getY();

        int pointX3 = pointXY3.getX();
        int pointY3 = pointXY3.getY();

        if((pointY3-pointY1)*(pointX2-pointX1)==(pointX3-pointX1)*(pointY2-pointY1)){
            return true;
        }
        return false;
    }
}
