package by.hez.jacoco_test;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
@Test
public class AppTest {

    @Test
    public void testSum() {
        Assert.assertEquals(new App().sum(1, 2), 3);
    }
}
