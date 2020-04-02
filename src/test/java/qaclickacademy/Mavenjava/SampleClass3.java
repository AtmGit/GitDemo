package qaclickacademy.Mavenjava;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class SampleClass3 
    extends TestCase
{
   
    public SampleClass3( String testName )
    {
        super( testName );
        System.out.println("Sample Class 3");
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( SampleClass3.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
