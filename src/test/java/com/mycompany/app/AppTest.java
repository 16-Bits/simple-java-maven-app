package com.mycompany.app;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Ignore;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void testAppConstructor() {
        App app1 = new App();
        App app2 = new App();
        assertEquals(app1.getMessage(), app2.getMessage());
    }

    @Test
    public void testAppMessage()
    {
        App app = new App();
        assertEquals("Hello World!", app.getMessage());
    }


    @Test
    public void autoPass()
    {
        App app = new App();
        assertEquals("Hello World!", app.getMessage());
    }



    @Test
    public void autoFail()
    {
        fail();
    }

    @Ignore
    @Test
    public void autoSkip()
    {
        fail();
    }

}
