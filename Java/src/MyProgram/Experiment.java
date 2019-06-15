package MyProgram.Work;

public class Experiment {
    private final int CONST_1 = 10;
    private String firstName;
    private String lastName;
    private String gender;
    private String email;

    public Experiment(String firstName, String lastName, String gender, String email) {
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setGender(gender);

        System.out.println("Ваше имя и фамилия: " + getFirstName() + " " + getLastName());
        System.out.println("Ваш email: " + getEmail());
        System.out.println("Ваш гендер: " + getGender());
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCONST_1() {
        return CONST_1;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


}
