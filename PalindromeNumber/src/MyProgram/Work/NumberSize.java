package MyProgram.Work;

public class NumberSize {
    public int numberSize(int number){
        int count =0;
        while (number>0){
            count++;
            number /= 10;
        }
        return count;
    }
}
