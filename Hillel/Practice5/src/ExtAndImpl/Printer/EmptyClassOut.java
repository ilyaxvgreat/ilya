package ExtAndImpl.Printer;

import ExtAndImpl.Converter.IStudentStringConverter;
import ExtAndImpl.Student;

public class EmptyClassOut implements IStudentPrinter {

    IStudentStringConverter iStudentStringConverter;

    public EmptyClassOut(IStudentStringConverter iStudentStringConverter) {
        this.iStudentStringConverter = iStudentStringConverter;
    }

    @Override
    public void outStudent(Student student) {
        // TOdo smth
    }
}
