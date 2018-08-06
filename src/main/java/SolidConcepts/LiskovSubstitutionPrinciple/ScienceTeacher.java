package SolidConcepts.LiskovSubstitutionPrinciple;

public class ScienceTeacher extends SchoolStaff implements CourseInstructor{
    @Override
    public void teach() {
        System.out.println("I teach science");
    }
}
