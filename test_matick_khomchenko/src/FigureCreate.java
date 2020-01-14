import java.math.BigDecimal;
import java.math.RoundingMode;

public class FigureCreate {
    private String colour;

    public FigureCreate(String colour) {
        this.colour = colour;
    }

    public FigureCreate() {
    }

    public String getColour() {
        return colour;
    }

    public IFigure[] createFigureList() {
        return new IFigure[(int) (Math.random() * 25) + 1];
    }

    public IFigure[] addRandomFigures(IFigure[] figures) {
        Colour colours = new Colour();
        for (int i = 0; i < figures.length; i++) {
            int count = (int) (Math.random() * 4) + 1;
            switch (count) {
                case 1:
                    double radius = new BigDecimal(Math.random() * 15)
                            .setScale(2, RoundingMode.UP).doubleValue();
                    figures[i] = new Circle(colours.getRandomColour(), radius);
                    break;
                case 2:
                    double side = new BigDecimal(Math.random() * 15)
                            .setScale(2, RoundingMode.UP).doubleValue();
                    figures[i] = new Square(colours.getRandomColour(), side);
                    break;
                case 3:
                    double topSide = new BigDecimal(Math.random() * 15)
                            .setScale(2, RoundingMode.UP).doubleValue();
                    double bottomSide = new BigDecimal(Math.random() * 15)
                            .setScale(2, RoundingMode.UP).doubleValue();
                    double height = new BigDecimal(Math.random() * 15)
                            .setScale(2, RoundingMode.UP).doubleValue();
                    figures[i] = new Trapeze(colours.getRandomColour(), topSide, bottomSide, height);
                    break;
                case 4:
                    double sideA = new BigDecimal(Math.random() * 15)
                            .setScale(2, RoundingMode.UP).doubleValue();
                    double heightA = new BigDecimal(Math.random() * 15)
                            .setScale(2, RoundingMode.UP).doubleValue();
                    figures[i] = new Triangle(colours.getRandomColour(), sideA, heightA);
                    break;
            }
        }
        return figures;
    }
}
