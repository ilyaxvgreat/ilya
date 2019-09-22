package ExtAndImpl.Printer;

import ExtAndImpl.Converter.IStudentStringConverter;
import ExtAndImpl.Student;

public class Out implements IStudentPrinter {
    IStudentStringConverter iStudentStringConverter;

    public Out(IStudentStringConverter iStudentStringConverter) {
        this.iStudentStringConverter = iStudentStringConverter;
    }

    @Override
    public void outStudent(Student student) {
        System.out.println(iStudentStringConverter.convert(student));
    }
}
