import javax.swing.text.html.HTMLDocument;
import java.awt.List;
import java.lang.reflect.Array;
import java.security.KeyStore;
import java.util.*;


public class Data {
//    public Integer a1 = new int[1, 0];
//      a2 = {2, 7};
//      a3 = {-1, 3};
//      a4 = {7, 2};
//      a5 = {3, -1};
//      a6 = {7, 2};
//      a7 = {0, 8};
//      a8 = {7, 2};
//      a9 = {3, -1};
//     a10 = {-1, 3};

    private HashMap<NumbersPair, Integer> data = new HashMap<>();

    public void putInHashMap() {
        data.put(new NumbersPair(1, 0), 1);
        data.put(new NumbersPair(2, 7), 1);
        data.put(new NumbersPair(-1, 3), 1);
        data.put(new NumbersPair(7, 2), 1);
        data.put(new NumbersPair(3, -1), 1);
        data.put(new NumbersPair(7, 2), 1);
        data.put(new NumbersPair(0, 8), 1);
        data.put(new NumbersPair(7, 2), 1);
        data.put(new NumbersPair(3, -1), 1);
        data.put(new NumbersPair(-1, 3), 1);
    }

    public void test() {
        
        for (Map.Entry<NumbersPair, Integer> i : data.entrySet()) {
            for (Map.Entry<NumbersPair, Integer> j : data.entrySet()) {
                if (i.getKey().getSecondNumber() == j.getKey().getFirstNumber() && i.getKey().getFirstNumber() == j.getKey().getSecondNumber()) {
                    int value;
                    value = data.get(i);
                    value++;
                    data.put((NumbersPair) i, value);
                    data.remove(j);
                    System.out.println("GOOD ");

                }
            }
        }

//        for (NumbersPair i : data.keySet()) {
//            for (NumbersPair j : data.keySet()) {
//                if (i.getFirstNumber() == j.getFirstNumber() && i.getSecondNumber() == j.getSecondNumber()) {
//                    int value = data.get(i);
//                    value++;
//                    data.put(i, value);
//                    data.remove(j);
//                    System.out.println("GOOD " + i.getFirstNumber() + " " + i.getSecondNumber() + " " + j.getSecondNumber() + " " + j.getFirstNumber() + data.);
//
//                    break;
//                }
//            }
//        }
//                System.out.println("[ " + entry.getKey() + " ; " + entry.getValue() + " ]" +
//                        "[ " + entry.getValue() + " ; " + entry.getKey() + " ]");
    }
}

class NumbersPair {

    private int firstNumber;
    private int secondNumber;

    public NumbersPair(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public NumbersPair() {
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

}

