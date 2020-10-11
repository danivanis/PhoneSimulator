package phonesimulator.constructor;

public class OnePlus6T extends OnePlus {

    public OnePlus6T (String color, String material, int IMEI){
        this(color, material, IMEI);
    }

    private OnePlus6T(double batteryLife, String color, String material, int IMEI) {
        this(21.3, color, material, IMEI);
    }

    private OnePlus6T(double batteryLife, String color, String material, int IMEI) {
        super(21.3, color, material, IMEI);
    }


    @Override
    public void addContact() {

    }

    @Override
    public void sendTextMessage() {

    }
}
