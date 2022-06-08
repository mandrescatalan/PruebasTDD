package testpruebajava;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Assume;

/**
 *
 * @author michael
 */
public class FibonacciTest {

    Fibonacci instance;

    public FibonacciTest() {
        instance = new Fibonacci();
    }

    @Test
    public void testValorEsperado() {

        int limite = 5;
        //boolean expResult = false;
        boolean result = instance.serieFibonacci(limite);
        assertEquals(true, result);
    }

    @Test
    public void testValorNegativo() {
        int limite = -1;
        //boolean expResult = false;
        boolean result = instance.serieFibonacci(limite);
        assertEquals(false, result);
    }

    @Test
    public void testValorCero() {

        Integer limite = 0;
        boolean expResult = false;
        boolean result = instance.serieFibonacci(limite);
        assertEquals(expResult, result);
    }

    @Test
    public void testValorFueraDelRango() {

        int limite = 110;
        boolean expResult = false;
        boolean result = instance.serieFibonacci(limite);
        assertEquals(expResult, result);
    }
    
    
    @Test(expected = NullPointerException.class)
    public void testValorNull() {
        
        Integer li = null;
        int limite = li;
        instance.serieFibonacci(limite);
      
    }
    
    
    @Test (expected = NumberFormatException.class)
    public void testValorCaracter() { 
        int limite = Integer.parseInt("e");
        instance.serieFibonacci(limite);
    }
    
}
