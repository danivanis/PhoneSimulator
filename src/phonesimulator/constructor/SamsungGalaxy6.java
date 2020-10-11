package phonesimulator.constructor;

import java.util.ArrayList;
import java.util.List;

public class SamsungGalaxy6 extends Samsung {

    public SamsungGalaxy6 (String color, String material, int IMEI){
        this(color, material, IMEI);
    }

    private SamsungGalaxy6(double batteryLife, String color, String material, int IMEI) {
        this(18.6, color, material, IMEI);
    }

    private SamsungGalaxy6 (double batteryLife, String color, String material, int IMEI) {
        super(batteryLife, color, material, IMEI);
    }

    private List<Contact> contacts = new ArrayList<>();
    private List<Call> calls = new ArrayList<>();
    private List<Message> messages = new ArrayList<>();

    @Override
    public void addContact(Contact contact) {
        this.contacts.add(contact);
    }

    @Override
    public void sendTextMessage() {

    }

    @Override
    public void makeCall() {

    }
}
