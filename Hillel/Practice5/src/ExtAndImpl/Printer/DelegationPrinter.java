package ExtAndImpl.Printer;

import ExtAndImpl.Student;

public class DelegationPrinter implements IStudentPrinter {
    private final IStudentPrinter[] iStudentPrinters;

    public DelegationPrinter(IStudentPrinter[] iStudentPrinters) {
        this.iStudentPrinters = iStudentPrinters;
    }

    @Override
    public void outStudent(Student student) {
        for (int i = 0; i < iStudentPrinters.length; i++) {
            iStudentPrinters[i].outStudent(student);
        }
    }
}
