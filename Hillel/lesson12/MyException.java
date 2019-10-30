package lesson12;

public class MyException extends Exception {

    public MyException(String ssss, Throwable m) {
        super(ssss, m);
    }

    public MyException() {
    }

}
