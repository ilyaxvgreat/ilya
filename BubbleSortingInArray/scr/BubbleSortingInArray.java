package MyProgram.Work;

import java.util.ArrayList;
import java.util.Scanner;

public class BubbleSortingInArray {

    private int arrayQntt;
    public ArrayList<Integer> list = new ArrayList();

    public int getArrayQntt() {
        return arrayQntt;
    }

    public void setArrayQntt(int arrayQntt) {
        this.arrayQntt = arrayQntt;
    }

    public void arraySizeCreater() {
        System.out.println("Enter the number of elements for the array");
        Scanner scn = new Scanner(System.in);
        while (!scn.hasNextInt()) {
            System.out.println("Input int");
            scn.next(); // this is important!
        }
        setArrayQntt(scn.nextInt());
    }

    public void arrayElementsCreater() {
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < getArrayQntt(); i++) {
            System.out.println("Input " + i);
            list.add(i, scn.nextInt());
        }
        System.out.println(list);
    }

    public void sorting() {
        int count;
        do {
            count = 0;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) > list.get(i + 1)) {
                    int num = list.get(i + 1);
                    list.set(i + 1, list.get(i));
                    list.set(i, num);
                    System.out.println(list);
                    count++;
                }
            }
        } while (count > 0);
    }
}
