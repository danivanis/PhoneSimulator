package phonesimulator.constructor;

public class OnePlus3T extends OnePlus {

    public OnePlus3T (String color, String material, int IMEI){
        this(color, material, IMEI);
    }

    private OnePlus3T(double batteryLife, String color, String material, int IMEI) {
        this(17.2, color, material, IMEI);
    }

    private OnePlus3T(double batteryLife, String color, String material, int IMEI) {
        super(17.2, color, material, IMEI);
    }


    @Override
    public void addContact() {

    }

    @Override
    public void sendTextMessage() {

    }


}
