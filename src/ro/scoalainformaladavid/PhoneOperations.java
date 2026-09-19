package ro.scoalainformaladavid;
public interface PhoneOperations {
    void addContact(String id, String phoneNumber, String firstName, String lastName);

    Contact getFirstContact();

    Contact getLastContact();

    void sendMessage(String phoneNumber, String messageContent);

    void getFirstMessage(String phoneNumber);

    void getSecondMessage(String phoneNumber);

    void call(String phoneNumber);

    void viewHistory();

}