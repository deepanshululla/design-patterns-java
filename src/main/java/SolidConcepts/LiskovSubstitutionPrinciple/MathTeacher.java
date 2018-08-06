package SolidConcepts.LiskovSubstitutionPrinciple;

public class MathTeacher extends SchoolStaff implements CourseInstructor{
    @Override
    public void teach() {
        System.out.println("I teach maths");
    }

}
