
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by dickdijk on 14/09/16.
 */
public class JoyOfHexTest {

    @Test
    public void test() {
        System.out.println("cafebabe:" + 0xcafebabe);
        System.out.println(
                Long.toHexString(0x100000000L + 0xcafebabeL));
    }
}
