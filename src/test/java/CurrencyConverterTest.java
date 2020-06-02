import  org.junit.Test;
import static org.junit.Assert.*;

public class CurrencyConverterTest {

    CurrencyConverter cc = new CurrencyConverter();
    @Test
    public void testConversion()
    {
        //since assertEqual(double, double) is depracated we are using assertEqual(double, double, double) for testing double values, since currency rates are in double.
        assertEquals(4.6,cc.convert("INR","JOD",500) ,0.01);
        assertEquals(0.0,cc.convert("YEN","JOD",500) ,0.01);
    }
}