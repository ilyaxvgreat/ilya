package Lesson1;

public class FormatDuration {

    private int number;

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void printOutResult() {
        System.out.println(yearsCalculate() +
                            daysCalculate() +
                            hoursCalculate() +
                            minutesCalculate() +
                            secondsCalculate());
    }

    private String yearsCalculate() {
        int years = getNumber() / 31536000;
        if (years > 0) {
            if (years == 1) {
                setNumber(number - years * 31536000);
                return years + " year ";
            }
            setNumber(number - years * 31536000);
            return years + " years ";
        } else {
            return "";
        }
    }

    private String daysCalculate() {
        int days = getNumber() / 86400;
        if (days > 0) {
            if (days == 1) {
                setNumber(number - days * 86400);
                return days + " day ";
            }
            setNumber(number - days * 86400);
            return days + " days ";
        } else {
            return "";
        }
    }

    private String hoursCalculate() {
        int hours = getNumber() / 3600;
        if (hours > 0) {
            if (hours == 1) {
                setNumber(number - hours * 3600);
                return hours + " hour ";
            }
            setNumber(number - hours * 3600);
            return hours + " hours ";
        } else {
            return "";
        }
    }

    private String minutesCalculate() {
        int minutes = getNumber() / 60;
        if (minutes > 0) {
            if (minutes == 1) {
                setNumber(number - minutes * 60);
                return minutes + " minute ";
            }
            setNumber(number - minutes * 60);
            return minutes + " minutes ";
        } else {
            return "";
        }
    }

    private String secondsCalculate() {
        int seconds = getNumber();
        if (seconds > 0) {
            if (seconds == 1) {
                return seconds + " second ";
            }
            return seconds + " seconds ";
        } else {
            return "";
        }
    }
}
