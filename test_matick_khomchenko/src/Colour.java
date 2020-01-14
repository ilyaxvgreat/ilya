import java.util.ArrayList;
import java.util.List;

public class Colour {

    public String getRandomColour() {
        List<String> colours = new ArrayList<>();
        colours.add("белый");
        colours.add("красный");
        colours.add("синий");
        colours.add("черный");
        colours.add("желтый");
        colours.add("розовый");
        colours.add("фиолетовый");
        colours.add("оранжевый");
        colours.add("коричневый");
        colours.add("серый");
        return colours.get((int) (Math.random() * 10));
    }
}
