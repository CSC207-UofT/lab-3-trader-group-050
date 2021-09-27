import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComputerTest {

    Computer c;

    @Before
    public void setUp() throws Exception {
        c = new Computer();
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(1000, c.getPrice());
    }

}
