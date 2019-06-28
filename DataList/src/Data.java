import java.util.*;

public class Data {
    //      a1 = {1, 0};
//      a2 = {2, 7};
//      a3 = {-1, 3};
//      a4 = {7, 2};
//      a5 = {3, -1};
//      a6 = {7, 2};
//      a7 = {0, 8};
//      a8 = {7, 2};
//      a9 = {3, -1};
//     a10 = {-1, 3};

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
                System.out.println("Good");
                System.out.println( data.containsKey(entry.getValue()) + " " + data.containsValue(entry.getKey()));
            }
        }
    }

    private List<Integer> reverse(List<Integer> list) {
        Collections.reverse(list);
        return list;
    }
}
