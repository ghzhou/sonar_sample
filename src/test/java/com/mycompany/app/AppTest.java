package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import com.mycompany.app.App;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testAdd() {
        assertTrue(2 == App.add(1,1));
    }

}
