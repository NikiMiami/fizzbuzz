import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {
    @Test
    public void testFizz(){
        assertEquals("Fizz", FizzBuzz.fizzbuzz(3));
        assertEquals("Buzz", FizzBuzz.fizzbuzz(5));
        assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(15));
        assertEquals("7", FizzBuzz.fizzbuzz(7));
        assertNotEquals("Fizz", FizzBuzz.fizzbuzz(55));
    }

}