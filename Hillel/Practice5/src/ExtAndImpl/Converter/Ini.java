package ExtAndImpl.Converter;

import ExtAndImpl.Student;

public class Ini implements IStudentStringConverter {
    @Override
    public String convert(Student student) {
        return "______\n" +
                "INI\n\n" +
                "name=" + student.getName() + "\n" +
                "age=" + student.getAge();
    }
}
