package ro.scoalainformaladavid;
public class Message {
    private String phoneNumber;
    private String messageContent;

    public Message(String phoneNumber, String messageContent) {
        this.phoneNumber = phoneNumber;
        if (messageContent.length() > 500) {
            System.out.println("Too many characters!");
            return;
        } else {
            this.messageContent = messageContent;
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getMessageContent() {
        return messageContent;
    }

    @Override
    public String toString() {
        return "Message [ " + "phoneNumber: " + phoneNumber + ", messageContent: " + messageContent + ' ' + ']';
    }

}
