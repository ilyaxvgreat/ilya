package IQOS;

import javax.swing.*;

import java.io.IOException;

import static java.lang.Integer.parseInt;

public class Add {

    private int number;
    private String firstName;
    private String lastName;
    private String city;
    private int mobileNumber;

    /**
     * get and set for all parameters
     */

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    /**
     * methods for all parameters
     */

//    public void add() {
//
//    }
    public void addNumber() {
        try {
            String number = JOptionPane.showInputDialog(null, "1");
            setNumber(parseInt(number));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e);
        }
    }

    public void addFirstName() {
        try {
            String firstName = JOptionPane.showInputDialog(null, "Введи ИМЯ");
            setFirstName(firstName);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e);
        }
    }

    public void addLastName() {
        try {
            String lastName = JOptionPane.showInputDialog(null, "Введи ФАМИЛИЮ");
            setLastName(lastName);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e);
        }
    }

    public void addCity() {
        try {
            String city = JOptionPane.showInputDialog(null, "Введи ГОРОД");
            setCity(city);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e);
        }
    }

    public void addMobileNumber() {
        try {
            String mobileNumber = JOptionPane.showInputDialog(null, "Введите МОБИЛЬНЫЙ");
            setMobileNumber(parseInt(mobileNumber));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e);
        }
    }
}
