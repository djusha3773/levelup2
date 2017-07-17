package org.levelup;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by root on 17.07.17.
 */
public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @BeforeClass
    public static void onlyOnce(){
        System.out.println("Before class");
    }


    @Before
    public void setup(){
        System.out.println("Before");

    }

   // @Ignore
    @Test
    public void sum(){

        assertEquals(7,calculator.sum(4,3));
        System.out.println("Test 1");
    }

    @Test(expected = NullPointerException.class,timeout = 1)
    public void devide(){
    assertEquals(1,calculator.divide(null,4),1.0d);
        System.out.println("Test 2");
    }


    @After
    public void tearDown(){
        System.out.println("After");

    }

    @AfterClass
    public static void tearDownOnce(){
        System.out.println("After class");

    }
}
