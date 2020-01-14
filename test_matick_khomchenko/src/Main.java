public class Main {

    public static void main(String[] args) {
        FigureCreate figures = new FigureCreate();

        IFigure[] figureList = figures.createFigureList();
        figures.addRandomFigures(figureList);

        for (IFigure figureCreate : figureList) {
            System.out.println(figureCreate.getParameters());
        }
    }
}
