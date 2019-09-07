package Practice3.University;

import Practice3.Peoples.Student;

public class Group {

    private String groupId;
    private Student[] students;

    @Override
    public String toString() {
        return  groupId ;
    }

    public Group(String groupId, Student[] students) {
        this.groupId = groupId;
        this.students=students;
    }
}
