package phonesimulator.constructor;

public class Call {

    int phoneNumber;

    public Call(){
        this(123456);
    }

    public Call(int phoneNumber){
        this.phoneNumber = phoneNumber;

    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

}
