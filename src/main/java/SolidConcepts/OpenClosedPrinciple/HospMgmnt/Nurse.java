package SolidConcepts.OpenClosedPrinciple.HospMgmnt;

public class Nurse extends Employee{
    public Nurse(int id, String name, String dept, boolean working) {
        super(id, name, dept, working);
        System.out.println("Nurse in action...");
    }

    @Override
    public void performDuties() {
        checkVitalSigns();
        drawBlood();
        cleanPatientArea();
    }

    public void checkVitalSigns(){
        System.out.println("Check vital signs...");
    }
    public void drawBlood(){
        System.out.println("Drawing out blood..");
    }
    public void cleanPatientArea(){
        System.out.println("Cleaning patient area..");
    }

}
