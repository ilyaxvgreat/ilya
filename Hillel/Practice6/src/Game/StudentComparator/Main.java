package Game.StudentComparator;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("IVAN", 10);
        Student student2 = new Student("IVAN", 20);
        Student student3 = new Student("OLEG", 30);

        int comparatorByAge = Student.comparatorByAge().compare(student1, student3);
        if(comparatorByAge ==1){
            System.out.println(student1.getName() + " older " + student3.getName());
        }else if(comparatorByAge ==0){
            System.out.println(student1.getName() + " and " + student3.getName() + " has the same age");
        }else {
            System.out.println(student1.getName() + " younger " + student3.getName());
        }

        int comparatorByName = Student.comparatorByName().compare(student1, student2);
        System.out.println(comparatorByName);

        int comparatorByNameByAge = Student.comparatorByNameByAge().compare(student1, student2);
        System.out.println(comparatorByNameByAge);
    }
}
