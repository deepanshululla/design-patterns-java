package SolidConcepts.LiskovSubstitutionPrinciple;

public class SchoolStaff {
    private void makeAnnouncement(){
        System.out.println("make announcemnet");
    }
    private void takeAttendance(){
        System.out.println("take attanedance");
    }
    private void collectPaperWork(){
        System.out.println("Collecting paperwork");
    }
    private void conductHallwayDuties(){
        System.out.println("conduct hallway duties...");
    }
    public void performOtherResponsibilities(){
        makeAnnouncement();
        takeAttendance();
        collectPaperWork();
        conductHallwayDuties();
    }
}

