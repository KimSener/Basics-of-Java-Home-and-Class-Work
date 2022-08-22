import java.time.LocalDateTime;
import java.util.Map;
import java.util.TreeMap;

public class MissedCalls {
    private Map<LocalDateTime, String> missedCalls = new TreeMap<>();

    public void addMissedContact(LocalDateTime time, String phoneNumber) {
        missedCalls.put(time, phoneNumber);
    }

    public void addMissedContact(String phone) {
        addMissedContact(LocalDateTime.now(), phone);
    }


    public String toString(PhoneBook phoneBook) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список пропущенных звонков");

        for (Map.Entry<LocalDateTime, String> timeAndPhone : missedCalls.entrySet()) {
            LocalDateTime time = timeAndPhone.getKey();
            String phone = timeAndPhone.getValue();
            Contact contact = phoneBook.findContact(phone);
            if (contact == null) {
                stringBuilder.append("\n").append(time).append("| ").append(phone);
            } else {
                stringBuilder.append("\n").append(time).append("| ").append(contact);
            }
        }
        return stringBuilder.toString();
    }
}

