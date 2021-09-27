// Tests for VroomVroomCar

import org.junit.*;

import static org.junit.Assert.*;

public class VroomVroomCarTest {
    VroomVroomCar fastboi;

    @Before
    public void setUp() throws Exception {
        fastboi = new VroomVroomCar();
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(10, fastboi.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        fastboi.upgradeSpeed();
        assertEquals(11, fastboi.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        fastboi.downgradeSpeed();
        assertEquals(9, fastboi.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(50, fastboi.getPrice());
    }

}
