import java.util.*;


public class Data {
    
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
        Iterator it = data.entrySet().iterator();

        for (Map.Entry<NumbersPair, Integer> entry1 : data.entrySet()) {
            for (Map.Entry<NumbersPair, Integer> entry2 : data.entrySet()) {

                NumbersPair key1 = entry1.getKey();
                Integer value1 = entry1.getValue();

                NumbersPair key2 = entry2.getKey();

                while (it.hasNext()) {
                    if (key1.getFirstNumber() == key2.getSecondNumber() && key2.getFirstNumber() == key1.getSecondNumber()) {
                        value1++;
                        data.put((NumbersPair) entry1,value1);
                        System.out.println("Good");
                        it.remove();
                    }
                }
            }
        }
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

