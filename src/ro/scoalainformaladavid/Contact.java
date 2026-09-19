package ro.scoalainformaladavid;
public class Contact {
    private String id;
    private String phoneNumber;
    private String firstName;
    private String lastName;

    public Contact(String id, String phoneNumber, String firstName, String lastName) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString(){
        return "Contact[ id: " + id + ", phoneNumber: " + phoneNumber + ", firstName: " + firstName + ", lastName: " + lastName + ' ' + ']';
    }
}
