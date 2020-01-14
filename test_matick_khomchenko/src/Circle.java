import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle extends FigureCreate implements IFigure {
    private double radius;

    public Circle(String colour, double radius) {
        super(colour);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        //TODO drawing
    }

    @Override
    public double calcArea() {
        double area = Math.PI * getRadius() * getRadius();
        return new BigDecimal(area)
                .setScale(2, RoundingMode.UP).doubleValue();
    }

    @Override
    public String getParameters() {
        return "Фигура: круг, площадь: " + calcArea() +
                " кв. ед., радиус: " + getRadius() +
                " ед., цвет: " + getColour() + ".";
    }
}
