package Game.First;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class Contact {

    private String name;
    private String mobNumber;

    public Contact(String name, String mobNumber) {
        this.name = name;
        this.mobNumber = mobNumber;
    }

    Collection<Contact> find(Collection<Contact> array, String name) {
        List<Contact> contactListResult = new ArrayList<>();
        for (Contact contact : array) {
            if (contact.getName().equals(name)) {
                contactListResult.add(contact);
            }
        }

        return contactListResult;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(name, contact.name) &&
                Objects.equals(mobNumber, contact.mobNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mobNumber);
    }

    public String getName() {
        return name;
    }

    public String getMobNumber() {
        return mobNumber;
    }
}
