package za.ac.cput.adp3;

public class Hourly{
    private double rate;
    private double hours;

    private Employee e;


    public Hourly(String n, double r, double hrs) {
        this.e = new Employee(n);
        this.rate = r;
        this.hours = hrs;
    }

    public void setRate(double r) {
        rate = r;
    }

    public void setHours(double hr) {
        hours = hr;
    }

    public double getRate() {
        return rate;
    }

    public double getHours() {
        return hours;
    }


    @Override
    public String toString() {
        return super.toString() + " (rate is " + rate + " and hours are " + hours + ')';
    }
}
