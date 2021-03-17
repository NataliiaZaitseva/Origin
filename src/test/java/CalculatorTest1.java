import junit.framework.TestCase;
import org.junit.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CalculatorTest1  extends TestCase{
     private Calculator calculator = new Calculator();



//    @Before
//    public  void initTest() {
//
//    }
//
//    @After
//    public void afterTest() {
//        calculator = null;
//    }

    @Test
    public void testGetSum()  throws Exception {
        assertEquals(15, calculator.getSum(5, 10));

    }

    @Test
    public void testGetDivide() throws Exception {
        assertEquals(6, calculator.getDivide(12, 2));
    }

    @Test
    public void testGetMultiple() throws Exception {
        assertEquals(9, calculator.getMultiple(3, 3));
    }

    @Test
    public void testGetSubtract() throws Exception {
        assertEquals(5, calculator.getSubtract(10, 5) );
    }

    @Test
    public void testGetSquareRoot() throws Exception {
        assertEquals(9.00, calculator.getSquareRoot(3, 2));
    }
}