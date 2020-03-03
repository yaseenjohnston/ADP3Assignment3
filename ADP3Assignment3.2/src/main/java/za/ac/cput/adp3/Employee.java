package za.ac.cput.adp3;

public class Employee{
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "name is " + name;
    }
}
