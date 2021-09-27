import org.junit.*;

import static org.junit.Assert.*;

public class KeyboardTest {
    Keyboard k;

    @Test(timeout = 50)
    public void TestGetPrice() {assertEquals(20, k.getPrice());}

    @Before
    public void setUp() throws Exception {
        k = new Keyboard();
    }

}
