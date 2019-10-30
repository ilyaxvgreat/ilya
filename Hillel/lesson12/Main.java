package lesson12;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(0);
        student.setName("");
        try {
            Main.another6();
        } catch (MyException e) {
            e.printStackTrace();
        }

        try {
            Main.anotherFunction7();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void another6() throws MyException {
        try {
            Student.deserialize("s");
        } catch (Exception e) {
            System.out.println("Error");
            throw e;
        }
    }

    static void anotherFunction7() {
        try {
            Student.deserialize("mm");
        } catch (Exception e) {
            throw new RuntimeException("ERROR", e);
        }
    }
}
