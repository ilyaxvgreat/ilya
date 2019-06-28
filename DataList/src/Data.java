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

    private Map<Integer, List<Integer>> data = new HashMap<Integer, List<Integer>>();

    private List<Integer> numbers1 = new ArrayList<Integer>() {{
        add(1);
        add(0);
    }};

    private List<Integer> numbers2 = new ArrayList<Integer>() {{
        add(2);
        add(7);
    }};

    private List<Integer> numbers3 = new ArrayList<Integer>() {{
        add(-1);
        add(3);
    }};

    private List<Integer> numbers4 = new ArrayList<Integer>() {{
        add(7);
        add(2);
    }};

    private List<Integer> numbers5 = new ArrayList<Integer>() {{
        add(3);
        add(-1);
    }};

    private List<Integer> numbers6 = new ArrayList<Integer>() {{
        add(7);
        add(2);
    }};

    private List<Integer> numbers7 = new ArrayList<Integer>() {{
        add(0);
        add(8);
    }};

    private List<Integer> numbers8 = new ArrayList<Integer>() {{
        add(7);
        add(2);
    }};

    private List<Integer> numbers9 = new ArrayList<Integer>() {{
        add(3);
        add(-1);
    }};

    private List<Integer> numbers10 = new ArrayList<Integer>() {{
        add(-1);
        add(3);
    }};

    public void putInHashMap() {
        data.put(1, numbers1);
        data.put(2, numbers2);
        data.put(3, numbers3);
        data.put(4, numbers4);
        data.put(5, numbers5);
        data.put(6, numbers6);
        data.put(7, numbers7);
        data.put(8, numbers8);
        data.put(9, numbers9);
        data.put(10, numbers10);
    }

    public void test() {
        for (Map.Entry<Integer, List<Integer>> entry : data.entrySet()) {
            if (data.containsValue(reverse(numbers10))) {
                System.out.println("Good");
            }
        }
    }

    private List<Integer> reverse(List<Integer> list) {
        Collections.reverse(list);
        return list;
    }
}
