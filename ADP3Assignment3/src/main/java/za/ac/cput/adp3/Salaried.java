package za.ac.cput.adp3;

public class Salaried extends Employee {

    double salary;

    public Salaried(String nam, double sal) {
        super(nam);
        this.salary = sal;
    }

    public void setSalary(double s) {
        salary = s;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + " (salary is " + salary + ")";
    }

}
