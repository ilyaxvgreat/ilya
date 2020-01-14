import java.math.BigDecimal;
import java.math.RoundingMode;

public class Square extends FigureCreate implements IFigure {
    private double side;

    public Square(String colour, double side) {
        super(colour);
        this.side = side;
    }

    private double getSide() {
        return side;
    }

    @Override
    public String getColour() {
        return super.getColour();
    }

    @Override
    public void draw() {
        //TODO drawing
    }

    @Override
    public double calcArea() {
        double area = Math.pow(getSide(), 2);
        return new BigDecimal(area)
                .setScale(2, RoundingMode.UP).doubleValue();
    }

    @Override
    public String getParameters() {
        return "Фигура: квадрат, площадь: " + calcArea() +
                " кв. ед., длина стороны: " + getSide() +
                " ед., цвет: " + getColour() + ".";
    }
}
