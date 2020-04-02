package qaclickacademy.Mavenjava;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class SampleTest2 
    extends TestCase
{
   
    public SampleTest2( String testName )
    {
        super( testName );
        System.out.println("This is a test2");
        System.out.println("This is a test3");
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( SampleTest2.class );
      
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
