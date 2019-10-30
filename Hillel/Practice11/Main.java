package Game;

import Game.First.CallLog;
import Game.First.Contact;
import Game.First.Message;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Contact> contactList = new ArrayList<>();
        List<CallLog> callLogList = new ArrayList<>();
        List<Message> messageList = new ArrayList<>();

        contactList.add(new Contact("ivan1", "1"));
        contactList.add(new Contact("oleg2", "2"));
        contactList.add(new Contact("dima3", "3"));
        contactList.add(new Contact("kolua4", "4"));
        contactList.add(new Contact("sisi5", "5"));
        contactList.add(new Contact("pipa6", "6"));
        contactList.add(new Contact("tom7", "7"));
        contactList.add(new Contact("abra8", "8"));

        callLogList.add(new CallLog(new Date(1, 2, 10), "1"));
        callLogList.add(new CallLog(new Date(1, 3, 21), "1"));
        callLogList.add(new CallLog(new Date(1, 4, 12), "1"));
        callLogList.add(new CallLog(new Date(1, 4, 12), "1"));
        callLogList.add(new CallLog(new Date(1, 4, 12), "1"));
        callLogList.add(new CallLog(new Date(1, 4, 12), "1"));

        callLogList.add(new CallLog(new Date(2, 5, 1), "2"));
        callLogList.add(new CallLog(new Date(3, 5, 7), "2"));
        callLogList.add(new CallLog(new Date(4, 5, 3), "2"));
        callLogList.add(new CallLog(new Date(4, 5, 3), "2"));

        callLogList.add(new CallLog(new Date(12, 10, 3), "3"));
        callLogList.add(new CallLog(new Date(15, 11, 3), "3"));
        callLogList.add(new CallLog(new Date(10, 3, 3), "3"));
        callLogList.add(new CallLog(new Date(10, 3, 3), "3"));
        callLogList.add(new CallLog(new Date(10, 1, 3), "3"));

        callLogList.add(new CallLog(new Date(10, 1, 3), "4"));
        callLogList.add(new CallLog(new Date(10, 1, 3), "4"));
        callLogList.add(new CallLog(new Date(10, 1, 3), "4"));
        callLogList.add(new CallLog(new Date(10, 1, 3), "4"));
        callLogList.add(new CallLog(new Date(10, 1, 3), "4"));
        callLogList.add(new CallLog(new Date(10, 1, 3), "4"));
        callLogList.add(new CallLog(new Date(10, 1, 3), "4"));

        callLogList.add(new CallLog(new Date(10, 1, 3), "5"));
        callLogList.add(new CallLog(new Date(10, 1, 3), "5"));
        callLogList.add(new CallLog(new Date(10, 1, 3), "5"));
        callLogList.add(new CallLog(new Date(10, 1, 3), "5"));
        callLogList.add(new CallLog(new Date(10, 1, 3), "5"));
        callLogList.add(new CallLog(new Date(10, 1, 3), "5"));
        callLogList.add(new CallLog(new Date(10, 1, 3), "5"));
        callLogList.add(new CallLog(new Date(10, 1, 3), "5"));

        callLogList.add(new CallLog(new Date(10, 1, 3), "6"));
        callLogList.add(new CallLog(new Date(10, 1, 3), "6"));

        callLogList.add(new CallLog(new Date(10, 1, 3), "7"));
        callLogList.add(new CallLog(new Date(10, 1, 3), "7"));

        callLogList.add(new CallLog(new Date(10, 1, 3), "8"));

        messageList.add(new Message("1hi", "1"));
        messageList.add(new Message("1hello", "1"));
        messageList.add(new Message("1hola", "1"));

        messageList.add(new Message("2chao", "2"));
        messageList.add(new Message("2goodbuy", "2"));
        messageList.add(new Message("2poka", "2"));
        messageList.add(new Message("2poka", "2"));

        messageList.add(new Message("3pipi", "3"));
        messageList.add(new Message("3popo", "3"));
        messageList.add(new Message("3papa", "3"));
        messageList.add(new Message("3papa", "3"));

        messageList.add(new Message("4paasdpa", "4"));
        messageList.add(new Message("4pa111pa", "4"));

        messageList.add(new Message("5aaaaa", "5"));

        messageList.add(new Message("6ewrccc", "6"));

        messageList.add(new Message("7asd", "7"));
        messageList.add(new Message("7fav", "7"));
        messageList.add(new Message("7papa", "7"));
        messageList.add(new Message("7csdf", "7"));
        messageList.add(new Message("7papefa", "7"));

        messageList.add(new Message("8papa", "8"));


        Map<Contact, List<CallLog>> map = new HashMap<>();
        Main main = new Main();
        main.findContact(contactList,"oleg2");
        main.findCalls(callLogList,"2");
        main.findMessages(messageList,"4pa111pa");

    }

    //    Реализуйте функции текстового поиска по коллекциям с контактами,
//    звонками и сообщениями (Collection<Contact> find(Collection<Contact>, String)).
//
    Collection<Contact> findContact(Collection<Contact> contacts, String name) {
        List<Contact> result = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                result.add(contact);
            }
        }
        return result;
    }

    Collection<CallLog> findCalls(Collection<CallLog> callLogs, String mobNum) {
        List<CallLog> result = new ArrayList<>();
        for (CallLog callLog : callLogs) {
            if (callLog.getMobNumber().equals(mobNum)) {
                result.add(callLog);
            }
        }
        return result;
    }

    Collection<Message> findMessages(Collection<Message> messages, String message) {
        List<Message> result = new ArrayList<>();
        for (Message message1 : messages) {
            if (message1.getMobNumber().equals(message)) {
                result.add(message1);
            }
        }
        return result;
    }

    //    5 Реализуйте вывод топ-5 контактов с наибольшим количеством звонков (List<Pair<Contact, Integer>>).
    Map<Contact, Integer> findMaxCallsQnt(Collection<Contact> contacts, Collection<Message> messages) {
        Map<Contact, Integer> result = new HashMap<>();

        for (Contact contact : contacts) {
            int count = 0;
            for (Message message : messages) {
                if (contact.getMobNumber().equals(message.getMobNumber())) {
                    result.put(contact, messages.size());
                    count++;
                }
            }
            result.put(contact, count);
        }
        result.entrySet().stream()
                .sorted(Map.Entry.<Contact, Integer>comparingByValue().reversed());


        return result;
    }

    //   7  Реализуйте вывод топ-5 контактов с наибольшим количеством сообщений (List<Pair<Contact, Integer>>).
    Map<Contact, Integer> findMaxMessageQnt(Collection<Contact> contacts, Collection<CallLog> callLogs) {
        Map<Contact, Integer> result = new HashMap<>();

        for (Contact contact : contacts) {
            int count = 0;
            for (CallLog callLog : callLogs) {
                if (contact.getMobNumber().equals(callLog.getMobNumber())) {
                    count++;
                }
            }
            result.put(contact, count);
        }

        result.entrySet().stream()
                .sorted(Map.Entry.<Contact, Integer>comparingByValue().reversed());

        return result;
    }

    //    4 Используя отображения, сгруппируйте все звонки по контактам и выведите на
//    консоль (Map<Contact, List<CallLog>>, Contact.hashCode, Contact.equals).
    Map<Contact, List<CallLog>> findCalls(Collection<Contact> contacts, Collection<CallLog> callLogs) {
        Map<Contact, List<CallLog>> result = new HashMap<>();
        for (Contact contact : contacts) {
            List<CallLog> resultX = new ArrayList();
            for (CallLog callLog : callLogs) {
                if (contact.getMobNumber().equals(callLog.getMobNumber())) {
                    resultX.add(callLog);
                    result.put(contact, resultX);
                }
            }
        }
        return result;
    }

    //    6 Используя отображения, сгруппируйте все сообщения по контактам (Map<Contact, List<Message>>).
    Map<Contact, List<Message>> findMessage(Collection<Contact> contacts, Collection<Message> messages) {
        Map<Contact, List<Message>> result = new HashMap<>();
        for (Contact contact : contacts) {
            List<Message> resultX = new ArrayList();
            for (Message message : messages) {
                if (contact.getMobNumber().equals(message.getMobNumber())) {
                    resultX.add(message);
                }
            }
            result.put(contact, resultX);
        }
        return result;
    }

}
