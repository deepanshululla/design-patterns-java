package SolidConcepts.OpenClosedPrinciple.HomeEntertainment;

public class Projector extends Device{
    @Override
    public void turnOn() {
        System.out.println("turn projector on");
    }

    @Override
    public void turnOff() {
        System.out.println("turn projector off");
    }
}
