package Practice3;

import Practice3.Peoples.Student;
import Practice3.Peoples.Teacher;
import Practice3.University.*;
import com.company.University.*;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Ivan");
        Student student2 = new Student("Oleg");
        Student student3 = new Student("Petro");
        Student student4 = new Student("Dima");
        Student student5 = new Student("Ilya");
        Student student6 = new Student("Serg");

        Group group12 = new Group("E-12", new Student[]{student1, student2});
        Group group522 = new Group("E-522", new Student[]{student3, student4});
        Group group769 = new Group("E-769", new Student[]{student5, student6});

        Teacher teacherPetrov = new Teacher("Petrov S.E.");
        Teacher teacherSmith = new Teacher("Smith J.K.");
        Teacher teacherJonson = new Teacher("Jonson K.V.");
        Teacher techerDevil = new Teacher("Devil L.A.");

        Department departmentBusiness = new Department("Business");
        Department departmentFinance = new Department("Finance");

        Room room312 = new Room(312);
        Room room502 = new Room(502);
        Room room127 = new Room(127);
        Room room475 = new Room(475);
        Room room129 = new Room(129);

        Faculty economicFaculty = new Faculty("Economic", new Group[]{group12, group522, group769},
                new Teacher[]{teacherPetrov, teacherSmith, teacherJonson, techerDevil},
                new Department[]{departmentBusiness, departmentFinance},
                new Room[]{room312, room502});

        Timetable timetable = new Timetable(group12, "Monday", "8:30", "Business", teacherJonson, room127);
        Timetable timetable1 = new Timetable(group522, "Thursday", "8:30", "Geometry", teacherPetrov, room129);
        Timetable timetable2 = new Timetable(group769, "Friday", "8:30", "Help", teacherSmith, room475);
        Timetable timetable3 = new Timetable(group12, "Saturday", "8:30", "Sport", techerDevil, room502);

        timetable.printTimeTableCap();

        timetable.printTimeTable(timetable);
        timetable1.printTimeTable(timetable1);
        timetable2.printTimeTable(timetable2);
        timetable3.printTimeTable(timetable3);

    }
}
