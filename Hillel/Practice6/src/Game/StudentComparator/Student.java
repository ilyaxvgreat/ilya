package Game.StudentComparator;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

public class Student {

    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     *
     */

    public static Comparator<Student> comparatorByName() {
        return new ComparatorByName();
    }

    private static class ComparatorByName implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    /**
     *
     */
    public static Comparator<Student> comparatorByAge() {
        return new ComparatorByAge();
    }

    private static class ComparatorByAge implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            if (o1.getAge() > o2.getAge()) {
                return 1;
            } else if (o1.getAge() == o2.getAge()) {
                return 0;
            } else {
                return -1;
            }
        }
    }

    /**
     *
     */
    public static Comparator<Student> comparatorByNameByAge() {
        return new ComparatorByNameByAge();
    }

    private static class ComparatorByNameByAge implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            Comparator<Student> nameAgeComp = new ComparatorByName().thenComparing(new ComparatorByAge());
            TreeSet<Student> students = new TreeSet(nameAgeComp);
            students.add(o1);
            students.add(o2);

            for(Student  o : students){
                System.out.println(o.getName() + " " + o.getAge());
            }

//            if (o1.getName().equals(o2.getName())) {
//                if (o1.getAge() > o2.getAge()) {
//                    return 1;
//                } else if (o1.getAge() == o2.getAge()) {
//                    return 0;
//                } else {
//                    return 2;
//                }
//            }
            return 0;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}
