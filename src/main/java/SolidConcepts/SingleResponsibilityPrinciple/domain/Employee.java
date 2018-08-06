package SolidConcepts.SingleResponsibilityPrinciple.domain;

public class Employee {
    private int id;
    private String name;
    private String dept;
    private boolean working;

    public Employee(int id, String name, String dept, boolean working) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.working = working;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", working=" + working +
                '}';
    }
}
