package phonesimulator.constructor;

public class SamsungNote10 extends Samsung {

    public SamsungNote10 (String color, String material, int IMEI){
        this(color, material, IMEI);
    }

    private SamsungNote10(double batteryLife, String color, String material, int IMEI) {
        this(20.1, color, material, IMEI);
    }

    private SamsungNote10(double batteryLife, String color, String material, int IMEI) {
        super(20.1, color, material, IMEI);
    }


    @Override
    public void addContact() {

    }

    @Override
    public void sendTextMessage() {

    }

    @Override
    public void makeCall() {

    }
}
