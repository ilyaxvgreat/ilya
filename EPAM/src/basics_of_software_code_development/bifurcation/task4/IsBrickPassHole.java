package basics_of_software_code_development.bifurcation.task4;

public class IsBrickPassHole {
    Brick brick;
    Hole hole;

    public IsBrickPassHole(Brick brick, Hole hole) {
        this.brick = brick;
        this.hole = hole;
    }

    public boolean IsBrickPassHole() {
        int holeSquare = hole.getA() * hole.getB();
        int brickSquareXY = brick.getX() * brick.getY();
        int brickSquareYZ = brick.getY()*brick.getZ();
        int brickSquareXZ = brick.getX()*brick.getZ();

        if (brickSquareXY <= holeSquare && hole.getA() >= brick.getX()) {
            return true;
        } else if (brickSquareXZ <= holeSquare && hole.getA() >= brick.getZ()) {
            return true;
        } else if (brickSquareYZ <= holeSquare && hole.getA()>=brick.getY()){
            return true;
        }
        return false;
    }

}
