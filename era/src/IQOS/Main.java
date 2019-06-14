package IQOS;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        FileCreate fileCreate = new FileCreate();
        fileCreate.fileCreate();

        Add add = new Add();
        add.addFirstName();
        add.addLastName();
        add.addCity();
        add.addMobileNumber();
        JOptionPane.showMessageDialog(null,
                "New user added " + "\n" +
                        "------------------" + "\n" +
                        "Имя: " + add.getFirstName() + "\n" +
                        "Фамилия: " + add.getLastName() + "\n" +
                        "Город: " + add.getCity() + "\n" +
                        "Мобильный: " + add.getMobileNumber());
    }
}
