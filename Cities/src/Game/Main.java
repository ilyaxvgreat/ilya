package Game;

/**Cities
 Combine cities so that the next one starts with the last letter of the previous, like: Paris->Stockholm->Milan

 Your score is the number of letters of all cities in your list.

 Example:
 Let's say input.txt has these cities:

 London
 Milan
 Stockholm
 Paris
 Your output.txt file can look like this::

 Paris
 Stockholm
 Milan
 *
 */

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        ReadInputFile readInputFile = new ReadInputFile();
        readInputFile.scanFileInArray();
        readInputFile.citiesResult();
    }
}
