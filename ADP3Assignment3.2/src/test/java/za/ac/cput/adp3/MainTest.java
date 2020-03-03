package za.ac.cput.adp3;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;
import za.ac.cput.adp3.Employee;
import za.ac.cput.adp3.Hourly;
import za.ac.cput.adp3.Salaried;

public class MainTest
{
    public void equalsTest()
    {
        Hourly h1 = new Hourly("Yaseen", 4500.00, 2);
        Hourly h2 = h1;
        assertEquals(h1, h2);

        Salaried s1 = new Salaried("Yaseen", 250.00);
        Salaried s2 = s1;
        assertEquals(s1, s2);
    }

    @Test
    public void objIdentityTest()
    {
        Hourly h1 = new Hourly("Yaseen", 4500.00, 2);
        assertSame("Should be the same.", h1, h1);

        Salaried s1 = new Salaried("Yaseen", 250.00);
        assertNotSame("Should not be the same.", h1, s1);
    }

    @Test
    public void failTest(){
        Hourly h1 = new Hourly("Yaseen", 4500.00, 2);
        Hourly h2 = new Hourly("Jake", 250.00, 9);

        assertEquals(h1, h2);
    }

    @Test(timeout = 1)
    public void testWithTimeout()
    {
        Hourly h1 = new Hourly("Yaseen", 4500.00, 2);
        Hourly h2 = new Hourly("Yaseen", 4500.00, 2);

        assertEquals(h1, h2);
    }

    @Ignore
    @Test
    public void testSame()
    {
        Salaried s1 = new Salaried("Yaseen", 250.00);
        assertSame("Should have same value", s1,1 );
    }
}
