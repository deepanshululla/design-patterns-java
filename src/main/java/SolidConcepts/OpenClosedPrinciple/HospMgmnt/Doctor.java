package SolidConcepts.OpenClosedPrinciple.HospMgmnt;

public class Doctor extends Employee {
    public Doctor(int id, String name, String dept, boolean working) {
        super(id, name, dept, working);
        System.out.println("Doctor in action");
    }

    @Override
    public void performDuties() {
        prescribeMedication();
        diagnosePatients();
    }

    public void prescribeMedication(){
        System.out.println("prescribing medication");
    }
    public void diagnosePatients(){
        System.out.println("Diagnosing patients..");
    }
}
