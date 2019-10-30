package Game.First;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Message {
    private String text;
    private String mobNumber;

    public Message(String text, String mobNumber) {
        this.text = text;
        this.mobNumber = mobNumber;
    }

    Collection<Message> find(Collection<Message> array, String mobNumberSearch) {
        List<Message> contactListResult = new ArrayList<>();
        for (Message message : array) {
            if (message.getMobNumber().equals(mobNumberSearch)) {
                contactListResult.add(message);
            }
        }
        return contactListResult;
    }

    public String getMobNumber() {
        return mobNumber;
    }
}
