package za.ac.cput.adp3;

public class Salaried {

    double salary;

    private Employee e;

    public Salaried(String nam, double sal) {
        this.e = new Employee(nam);
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
