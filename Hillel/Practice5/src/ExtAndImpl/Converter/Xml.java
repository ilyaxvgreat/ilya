package ExtAndImpl.Converter;

import ExtAndImpl.Student;

public class Xml implements IStudentStringConverter {
    @Override
    public String convert(Student student) {
        String tab = "       ";
        return new StringBuilder()
                .append("______\n")
                .append("XML\n\n")
                .append("<student>\n")
                .append(tab).append("<name>").append(student.getName()).append("</name>\n")
                .append(tab).append("<age>").append(student.getAge()).append("</age>\n")
                .append("</student>").toString();
    }
}
