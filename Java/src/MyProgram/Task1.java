package MyProgram.Work;

/**
 * 10. Найдите победителя марафона.
 * //        Группа людей участвует в марафоне, их имена и время за которое они пробежали марафон вы можете увидеть ниже.
 * //        Ваша задача найти человека, который быстрее всех пробежал дистанцию и вывести его имя и счет.
 * //        (Опционально) Найдите человека, который прибежал вторым.
 * //
 * //        String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John",
 * "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate" };
 * //
 * /        int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265 };
 */
public class Task1 {

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.maxTime();
        task1.maxName();
    }

    private String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John",
            "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};

    private int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 2650};

    private int maxTime;
    private int maxTimeIndex;


    public void setMaxTime(int maxTime) {
        this.maxTime = maxTime;
    }

    public int getMaxTimeIndex() {
        return maxTimeIndex;
    }

    public void setMaxTimeIndex(int maxTimeIndex) {
        this.maxTimeIndex = maxTimeIndex;
    }


    public void maxTime() {
        setMaxTime(times[0]);
        setMaxTimeIndex(0);
        for (int i = 0; i < times.length; i++) {
            if (maxTime < times[i]) {
                setMaxTime(times[i]);
                setMaxTimeIndex(i);
            }
        }
    }

    public void maxName() {
        System.out.println("Max" + "\n" +
                           "Name/Time " + "\n" +
                           names[getMaxTimeIndex()] + "/" + times[getMaxTimeIndex()]);
    }
}
