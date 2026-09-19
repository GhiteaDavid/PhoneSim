package ro.scoalainformaladavid;

public class Main {
    public static void main(String[] args) {
        Phone phone = new SamsungGalaxy6();

        phone.addContact("1", "123", "David", "Ghitea");

        phone.addContact("2", "456", "Alex", "Popescu");

        phone.getFirstContact();

        phone.getLastContact();

// send a message to the first contact from the previously listed

// max number of characters - 100

        phone.sendMessage("123", "Hi,David");

        phone.sendMessage("123", "How are you,David?");

        phone.sendMessage("456", "Hi,Alex");

        phone.sendMessage("456", "How are you,Alex?");

        phone.getFirstMessage("123");

        phone.getFirstMessage("456");

        phone.getSecondMessage("123");
// make a call to the second contact from the previously listed

        phone.call("456");
        phone.call("123");
        phone.call("456");


        Contact c = phone.getFirstContact();
        System.out.println(c);
        phone.viewHistory();

        int Battery = phone.getCurrentBattery();
        System.out.println("Battery: " + Battery);
    }
}
