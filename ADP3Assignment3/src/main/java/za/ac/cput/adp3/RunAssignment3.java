package za.ac.cput.adp3;

public class RunAssignment3
{
    public static final int MAX_EMPLOYEES = 10;



    public static void main( String[] args )
    {

        Employee e = new Salaried("Yaseen Johnston", 45000.00);
        System.out.println("Employee: " + e.toString());

        Employee e1 = new Hourly("Adam Adams", 2500, 5);
        System.out.println("Employee: " + e1.toString());


        Employee emp1 = new Hourly("Jimmy Jungle", 20.00, 2);
        System.out.println("Employee " + emp1.getName());

    }
}
