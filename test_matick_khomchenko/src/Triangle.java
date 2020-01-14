import java.math.BigDecimal;
import java.math.RoundingMode;

public class Triangle extends FigureCreate implements IFigure {
    private double sideA;
    private double heightA;

    public Triangle(String colour, double sideA, double heightA) {
        super(colour);
        this.sideA = sideA;
        this.heightA = heightA;
    }

    public double getSideA() {
        return sideA;
    }

    public double getHeightA() {
        return heightA;
    }

    @Override
    public void draw() {
        //TODO drawing
    }

    @Override
    public double calcArea() {
        double area = getSideA() * getHeightA() / 2;
        return new BigDecimal(area)
                .setScale(2, RoundingMode.UP).doubleValue();
    }

    @Override
    public String getParameters() {
        return "Фигура: треугольник, площадь: " + calcArea() +
                " кв. ед., длина стороны: " + getSideA() +
                " ед., длина высоты: " + getHeightA() +
                " ед., цвет: " + getColour() + ".";
    }
}
