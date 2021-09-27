import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class camelTest {
    Camel c;

    @Before
    public void setUp() throws Exception {
        c = new Camel();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Grunt!", c.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(5, c.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        c.upgradeSpeed();
        assertEquals(10, c.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        c.downgradeSpeed();
        assertEquals(0, c.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(200, c.getPrice());
    }

}