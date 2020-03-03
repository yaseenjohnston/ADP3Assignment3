package za.ac.cput.adp3;

public abstract class Employee implements Payable{

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void setName(String nm) {
        name = nm;
    }

    public String toString() {
        return "name is " + name;
    }
}
