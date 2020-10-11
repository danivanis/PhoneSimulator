package phonesimulator.constructor;

import phonesimulator.interfaces.PhoneBehaviour;

import java.util.ArrayList;
import java.util.List;

public abstract class Phone implements PhoneBehaviour {

    private int batteryConsumption;
    private Message messageContent;
    private Contact phoneNumber;

    private List<Contact> contacts = new ArrayList<>();
    private List<Call> calls = new ArrayList<>();
    private List<Message> messages = new ArrayList<>();

    Contact contact = new Contact();
    Call call = new Call();
    Message message = new Message();

    private final double batteryLife;
    private String color;
    private String material;
    private int IMEI;

    public Phone(double batteryLife, String color, String material, int IMEI){
        this.batteryLife = batteryLife;
        this.color = color;
        this.material = material;
        this.IMEI = IMEI;
    }

    public void addContact(Contact contact) {
        this.contacts.add(contact);
    }

    public void sendTextMessage(Message message){
        this.messages.add(message);
        this.batteryConsumption -= 2;
    }

    public void makeCall(Call calls){
        this.calls.add(calls);
        this.batteryConsumption -= 2;
    }

    public void listMessages(){
        for (Message message: messages){
            System.out.println(message);
        }
    }

    public void listContacts(){
        for (Contact contact: contacts){
            System.out.println(contact);
        }
    }

    public void callHistory(){
        for (Call call: calls){
            System.out.println(call);
        }
    }

    public int getBatteryConsumption(){
        return batteryConsumption;
    }

}
