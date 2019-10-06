package Game;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class ReadInputFile {

    private ArrayList<String> cityList = new ArrayList<>();


    void scanFileInArray() throws FileNotFoundException {
        String path = "C:\\Users\\iliys\\IdeaProjects\\Cities\\src\\Game\\input.txt";
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        Scanner scanner = new Scanner(fileReader);

        while (scanner.hasNextLine()) {
            cityList.add(scanner.nextLine());
        }
        System.out.println(cityList);
        System.out.println("File scanned");
        scanner.close();
        try {
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void citiesResult() {
        Deque<String> result = new LinkedList<>();
        for (int i = 0; i < cityList.size(); i++) {
            for (int j = 0; j < cityList.size(); j++) {
                if (i == j)
                    continue;
                String city1 = cityList.get(i).toLowerCase();
                String city2 = cityList.get(j).toLowerCase();
                if (city1.startsWith(city2.substring(city2.length() - 1))) {
                    if (!result.contains(cityList.get(j))) {
                        result.addFirst(cityList.get(j));
                    }
                    if (!result.contains(cityList.get(i))) {
                        result.addLast(cityList.get(i));
                    }
                }
            }
        }
        System.out.println(result);
    }
}
