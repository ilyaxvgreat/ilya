import ExtAndImpl.Converter.Ini;
import ExtAndImpl.Converter.Json;
import ExtAndImpl.Converter.Xml;
import ExtAndImpl.Printer.DelegationPrinter;
import ExtAndImpl.Printer.EmptyClassOut;
import ExtAndImpl.Printer.IStudentPrinter;
import ExtAndImpl.Printer.Out;

import ExtAndImpl.Student;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("Ivan", 43);
        Json json = new Json();
        Xml xml = new Xml();
        Ini ini = new Ini();

        System.out.println(json.convert(student));
        System.out.println(xml.convert(student));
        System.out.println(ini.convert(student));

        Out outIni = new Out(ini);
        outIni.outStudent(student);

        Out outJson = new Out(json);
        outJson.outStudent(student);

        Out outXml = new Out(xml);
        outXml.outStudent(student);

        EmptyClassOut emptyClassOutIni = new EmptyClassOut(ini);
        emptyClassOutIni.outStudent(student);

        EmptyClassOut emptyClassOutJson = new EmptyClassOut(json);
        emptyClassOutJson.outStudent(student);

        EmptyClassOut emptyClassOutXml = new EmptyClassOut(xml);
        emptyClassOutXml.outStudent(student);

        DelegationPrinter delegation = new DelegationPrinter(new IStudentPrinter[]{
                emptyClassOutIni,
                emptyClassOutJson,
                emptyClassOutXml
        });
        delegation.outStudent(student);
    }

}
