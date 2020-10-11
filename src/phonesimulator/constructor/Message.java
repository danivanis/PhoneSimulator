package phonesimulator.constructor;

public class Message {

    Contact phoneNumber;
    private String messageContent;

    public Message (Contact phoneNumber, String messageContent){
        this.phoneNumber = phoneNumber;
        this.messageContent = messageContent;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public Contact getPhoneNumber() {
        return phoneNumber;
    }


}
