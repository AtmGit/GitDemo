package qaclickacademy.Mavenjava;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class SampleClass 
    extends TestCase
{
   
    public SampleClass( String testName )
    {
        super( testName );
        System.out.println("This is a test");
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( SampleClass.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
