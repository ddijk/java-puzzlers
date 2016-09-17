
import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by dickdijk on 14/09/16.
 */
public class CleverSwapTest {

    @org.junit.Test
    public void main() throws Exception {
        CleverSwap.main(null);
    }

    @Test
    public void testLeftToRight() {
        int a = 2;
        int b = 3;
        int c = (a *= a += b);
        Assert.assertEquals("Niet L to R", 7, c);
    }

    @Test
    public void testRightToLeft() {
        int a = 2;
        int b = 3;
        int c = (a *= a += b);
        Assert.assertEquals("Niet R to L", 25, c);
    }
}
