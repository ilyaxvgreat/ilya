import java.math.BigDecimal;
import java.math.RoundingMode;

public class Trapeze extends FigureCreate implements IFigure {
    private double topSide;
    private double bottomSide;
    private double height;

    public Trapeze(String colour, double topSide, double bottomSide, double height) {
        super(colour);
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.height = height;
    }

    public double getTopSide() {
        return topSide;
    }

    public double getBottomSide() {
        return bottomSide;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void draw() {
        //TODO drawing
    }

    @Override
    public double calcArea() {
        double area = (getTopSide() + getBottomSide()) * getHeight() / 2;
        return new BigDecimal(area)
                .setScale(2, RoundingMode.UP).doubleValue();
    }

    @Override
    public String getParameters() {
        return "Фигура: трапеция, площадь: " + calcArea() +
                " кв. ед., длина верхнего основания: " + getTopSide() +
                " ед., длина нижнего основания: " + getBottomSide() +
                " ед., длина высоты: " + getHeight() +
                " ед., цвет: " + getColour() + ".";
    }
}
