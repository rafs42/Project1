package TestPackage1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{    private App as;
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testApp(){
        String s1 = as.getsha256("HelloWorld");
        assertEquals("[B@799f7e29", s1);
    }


    @Test
    public void testApp2(){
        String s1 = as.getsha256("HelloWorld2");
        assertEquals("xyz", s1);
    }




//    public void shouldAnswerWithTrue()
//    {
//        assertTrue( true );
//    }
}
