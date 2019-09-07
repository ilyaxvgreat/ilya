package Practice3.University;

import java.util.Formatter;

import Practice3.Peoples.Teacher;

public class Timetable {
    Group group;
    String day;
    String time;
    String lessonTitle;
    Teacher teacher;
    Room room;

    public Timetable(Group group, String day, String time, String lessonTitle, Teacher teacher, Room room) {
        this.group = group;
        this.day = day;
        this.time = time;
        this.lessonTitle = lessonTitle;
        this.teacher = teacher;
        this.room = room;
    }

    public void printTimeTableCap() {
        System.out.println(
        "________________________________________________________________________________\n" +
        "|   Group   " + "|     Day     " + "|   Time   " + "|   Lesson   " + "|     Teacher     " + "|   Room   |\n" +
        "¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯"
        );
    }

    public void printTimeTable(Timetable timetable) {
        Formatter formatter = new Formatter();
        formatter.format("%-11s %-13s %-10s %-12s %-17s %-10s %s\n",
                "| " + getGroup(),
                "| " + getDay(),
                "| " + getTime(),
                "| " + getLessonTitle(),
                "| " + getTeacher(),
                "| " + getRoom(),
                "|");
        System.out.format(String.valueOf(formatter));
    }

    public Group getGroup() {
        return group;
    }

    public String getDay() {
        return day;
    }

    public String getTime() {
        return time;
    }

    public String getLessonTitle() {
        return lessonTitle;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Room getRoom() {
        return room;
    }
}
