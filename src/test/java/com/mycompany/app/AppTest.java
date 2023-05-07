package com.mycompany.app;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    void testAppConstructor() {
        App app1 = new App();
        App app2 = new App();
        assertEquals(app1.getMessage(), app2.getMessage());
    }

    @Test
    void testAppMessage()
    {
        App app = new App();
        assertEquals("Hello World!", app.getMessage());
    }
/**
    @Test
    void autoPass()
    {
        App app = new App();
        assertEquals("Hello World!", app.getMessage());
    }

    @Test
    void autoFail()
    {
        fail();
    }

    @Disabled
        @Test
        void autoSkip()
        {
            fail();
        }
*/
}
