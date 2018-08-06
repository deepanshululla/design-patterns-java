package SolidConcepts.OpenClosedPrinciple.HomeEntertainment;

public class RemoteControl {
    static Device device=null;
    private static final RemoteControl INSTANCE = new RemoteControl();
    private RemoteControl(){
    }

    public static RemoteControl getInstance(){
        return INSTANCE;
    }
    public static void connectTo(Device dev){
        device=dev;
    }
    public void turnOnDevice(){
        device.turnOn();
    }
    public void turnOffDevice(){
        device.turnOff();
    }
}
