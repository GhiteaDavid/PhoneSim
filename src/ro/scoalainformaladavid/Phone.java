package ro.scoalainformaladavid;

import java.util.ArrayList;
import java.util.List;

public abstract class Phone implements PhoneOperations {
    private final int batteryLife;
    private String color;
    private String material;
    private final String imei;
    private int currentBattery;
    private List<Contact> contactList = new ArrayList<>();
    private List<Message> messageList = new ArrayList<>();
    private List<Call> historyCallList = new ArrayList<>();

    public Phone(int batteryLife, String color, String material, String imei) {
        this.batteryLife = batteryLife;
        this.color = color;
        this.material = material;
        this.imei = imei;
        this.currentBattery = batteryLife;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public String getImei() {
        return imei;
    }

    public int getCurrentBattery() {
        return currentBattery;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void addContact(String id, String phoneNumber, String firstName, String lastName) {
        Contact contact = new Contact(id, phoneNumber, firstName, lastName);
        contactList.add(contact);
    }

    @Override
    public Contact getFirstContact() {
        return contactList.get(0);
    }

    @Override
    public Contact getLastContact() {
        return contactList.get(contactList.size() - 1);

    }

    @Override
    public void sendMessage(String phoneNumber, String messageContent) {
        Message message = new Message(phoneNumber, messageContent);
        if (message.getMessageContent() != null) {
            messageList.add(message);
            currentBattery = currentBattery - 1;
        }
    }

    @Override
    public void getFirstMessage(String phoneNumber) {
        for (Message message : messageList) {
            if (message.getPhoneNumber().equals(phoneNumber)) {
                System.out.println(message.getMessageContent());
                break;
            }
        }
    }

    @Override
    public void getSecondMessage(String phoneNumber) {
        int nr = 0;
        for (Message message : messageList) {
            if (message.getPhoneNumber().equals(phoneNumber)) {
                nr++;
                if (nr == 2) {
                    System.out.println(message.getMessageContent());
                }
            }
        }
    }

    @Override
    public void call(String phoneNumber) {
        Call call = new Call(phoneNumber);
        historyCallList.add(call);
        currentBattery = currentBattery - 2;
    }

    @Override
    public void viewHistory() {
        System.out.println(historyCallList);
    }
}
