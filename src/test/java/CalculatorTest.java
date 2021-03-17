import org.junit.Test;


import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertEquals;
public class CalculatorTest {
    Calculator calculator=new Calculator();
    public void testMain() {
    }

    @Test
    public void testFactTruePositive() {
        assertEquals("Factorial of the number for True Positive ",1,calculator.factorial(0));
        assertEquals("Factorial of the number for True Positive",1,calculator.factorial(1));
        assertEquals("Factorial of the number for True Positive",120,calculator.factorial(5));
    }

    @Test
    public void testFactFalsePositive() {
        assertNotEquals("Factorial of the number for False Positive ",0,calculator.factorial(0));
        assertNotEquals("Factorial of the number for False Positive",0,calculator.factorial(1));
        assertNotEquals("Factorial of the number for False Positive",0,calculator.factorial(5));
    }



    @Test
    public void testSquareRootFalsePositive() {
        assertNotEquals("Square Root of the number for False Positive ",1,calculator.squareRoot(0));
        assertNotEquals("Square Root of the number for False Positive",-1,calculator.squareRoot(1));
        assertNotEquals("Square Root of the number for False Positive",20,calculator.squareRoot(4));

    }

    @Test
    public void testPowerFalsePositive() {
        assertNotEquals("Power of the number for false Positive ",0,calculator.power(0,0));
        assertNotEquals("Power of the number for false Positive",6,calculator.power(4,3));
        assertNotEquals("Power of the number for false Positive",1,calculator.power(-1,3));
    }
}
