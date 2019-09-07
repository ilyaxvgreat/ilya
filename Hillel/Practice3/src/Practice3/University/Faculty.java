package Practice3.University;

import Practice3.Peoples.Teacher;

public class Faculty {

    private String facultyTitle;
    private Group[] groups;
    private Teacher[] teachers;
    private Department[] departments;
    private Room[] rooms;

    public Faculty(String facultyTitle, Group[] groups, Teacher[] teachers, Department[] departments, Room[] rooms) {
        this.facultyTitle = facultyTitle;
        this.groups = groups;
        this.teachers = teachers;
        this.departments = departments;
        this.rooms = rooms;
    }

}
