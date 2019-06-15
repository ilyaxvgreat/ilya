package MyProgram.Work;

public class Random {

    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void randomNumbers() {
        int[] arrayRandom = new int[getSize()];
        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i] = (int) (Math.random() * 30000);
            System.out.println(arrayRandom[i]);
        }

        //сортировка четных чисел массива и нечетных
        for (int i = 0; i < arrayRandom.length; i++) {
            if (arrayRandom[i] % 2 == 0) {
                System.out.print("Четные " + arrayRandom[i]);
            } else {
                System.out.print("НЕ_Четные " + arrayRandom[i]);
            }
        }


        //max number in array
        int max = arrayRandom[0];
        int min = arrayRandom[0];
        for (int i = 0; i < arrayRandom.length; i++) {
            if (max < arrayRandom[i]) {
                max = arrayRandom[i];
            }
            if (min > arrayRandom[i]) {
                min = arrayRandom[i];
            }
        }
        System.out.println("Максимальное " + max);
        System.out.println("Минимальное " + min);

        //определение натуральности числа
        for (int i = 0; i < arrayRandom.length; i++) {
            if (arrayRandom[i] % 2 != 0 & arrayRandom[i] % 3 != 0 & arrayRandom[i] % 5 != 0 & arrayRandom[i] % 7 != 0) {
                System.out.println("Простое  " + arrayRandom[i]);
            }
        }
    }
}
