package SolidConcepts.LiskovSubstitutionPrinciple;

public class EnglishTeacher extends SchoolStaff implements CourseInstructor{
    @Override
    public void teach() {
        System.out.println("I teach english");
    }

}
