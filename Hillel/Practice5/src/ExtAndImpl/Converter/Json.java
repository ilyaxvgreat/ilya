package ExtAndImpl.Converter;

import ExtAndImpl.Student;

public class Json implements IStudentStringConverter {
    @Override
    public String convert(Student student) {
        return new StringBuilder()
                .append("______\n")
                .append("JSON\n\n")
                .append("{\n")
                .append("\"name\": \"").append(student.getName()).append("\",\n")
                .append("\"age\": \"").append(student.getAge()).append("\"").append("\n")
                .append("}").toString();
    }
}
