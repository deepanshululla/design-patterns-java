package SolidConcepts.OpenClosedPrinciple.HomeEntertainment;

public class SurroundSoundSystem extends Device {
    @Override
    public void turnOn() {
        System.out.println("Turn on Surround system");
    }

    @Override
    public void turnOff() {
        System.out.println("turn off surround system");
    }
}
