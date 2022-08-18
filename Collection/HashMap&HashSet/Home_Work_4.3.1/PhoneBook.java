import java.util.*;

public class PhoneBook {

    private Map<String, List<Contact>> contact = new HashMap<>();

    public void addGroup(String group) {
        if (contact.containsKey(group)) {
            System.out.println("Внимание Группа с таким именем уже существует");
            System.out.println();
        } else {
            contact.put(group, new ArrayList<>());

        }
    }

    public void contactsAdd(Contact contacts, String group) {
        contact.get(group).add(contacts);

    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список групп :\n");
        for (String group : contact.keySet()) {
            stringBuilder.append("\t").append(group).append(" \n");
            List<Contact> contacts = contact.get(group);
            if (contacts.isEmpty()) {
                System.out.println("Группа контактов пуста");
            } else {
                for (Contact contact : contacts) {
                    stringBuilder.append("\t\t\t").append(contact).append("\n");
                }
            }
        }
        return stringBuilder.toString();
    }


}