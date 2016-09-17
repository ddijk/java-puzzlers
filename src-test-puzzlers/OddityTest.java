
import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by dickdijk on 14/09/16.
 */
public class OddityTest {

    @org.junit.Test
    public void isOdd() throws Exception {
        System.out.println("antw:" + (-1 % 2));
        System.out.println("antw:" + (-4 % 2));
        Assert.assertTrue(Oddity.isOdd(1));
        Assert.assertFalse(Oddity.isOdd(2));
        Assert.assertTrue(Oddity.isOdd(3));
        Assert.assertTrue(Oddity.isOdd(-1));
    }

}
