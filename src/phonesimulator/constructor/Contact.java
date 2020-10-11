package phonesimulator.constructor;

public class Contact {

    private int contactOrder;
    public int phoneNumber;
    private String firstName;
    private String lastName;

    public Contact(){
        this(1, 123456,"alfa", "beta");
    }

    public Contact (int contactOrder, int phoneNumber, String firstName, String lastName){
        this.contactOrder = contactOrder;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getContactOrder() {
        return contactOrder;
    }

    public String getLastName() {
        return lastName;
    }
}
