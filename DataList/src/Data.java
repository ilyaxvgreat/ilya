import java.util.*;

public class Data {

    private Map<Integer, Integer> data = new HashMap<Integer, Integer>();

    public void putInHashMap() {

        data.put(1, 0);
        data.put(2, 7);
        data.put(-1, 3);
        data.put(7, 2);
        data.put(3, -1);
        data.put(7, 2);
        data.put(0, 8);
        data.put(7, 2);
        data.put(3, -1);
        data.put(-1, 3);
    }

    public void test() {
        for (Map.Entry<Integer, Integer> entry : data.entrySet()) {
            if (data.containsKey(entry.getValue()) && data.containsValue(entry.getKey())) {
                System.out.println("[ " + entry.getKey() + " ; " + entry.getValue() + " ]" +
                        "[ " + entry.getValue() + " ; " + entry.getKey() + " ]");
            }
        }
    }
}
