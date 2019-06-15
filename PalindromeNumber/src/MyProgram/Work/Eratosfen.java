package MyProgram.Work;

import java.util.ArrayList;


public class Eratosfen {
    private final int FIRST_ARRAY_NUM = 10000;
    private final int LAST_ARRAE_NUM = 99999;
    public ArrayList<Integer> eratosfenArray;


    public int getLAST_ARRAE_NUM() {
        return LAST_ARRAE_NUM;
    }

    public int getFIRST_ARRAY_NUM() {
        return FIRST_ARRAY_NUM;
    }


    public void arrayCreater() {

//        eratosfenArray.ensureCapacity(getLAST_ARRAE_NUM() - getFIRST_ARRAY_NUM());
        for (int i = 0; i < eratosfenArray.size(); i++) {
//            eratosfenArray;
        }
        System.out.println(eratosfenArray);

        for (int i = 0; i < eratosfenArray.size(); i++) {
            eratosfenArray.removeIf(y -> (y % 2 == 0));
            eratosfenArray.removeIf(y -> (y % 3 == 0));
            eratosfenArray.removeIf(y -> (y % 5 == 0));
            eratosfenArray.removeIf(y -> (y % 7 == 0));
        }
        System.out.println(eratosfenArray);
    }
}

