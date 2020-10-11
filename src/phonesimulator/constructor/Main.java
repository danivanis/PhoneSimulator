package phonesimulator.constructor;

public class Main {

    public static void main(String[] args) {


        Phone phone1 = new SamsungGalaxy6("green", "plastic", 184596132);
        Phone phone2 = new OnePlus3T("blue", "glass", 154789613);
        Phone phone3 = new OnePlus6T("black", "glass", 154789666);
        Phone phone4 = new SamsungNote10("white", "glass", 184596144);


        phone1.addContact();
        phone1.makeCall();
        phone1.sendTextMessage();


    }

}
