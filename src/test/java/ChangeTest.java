
import java.math.BigDecimal;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by dickdijk on 14/09/16.
 */
public class ChangeTest {

    @Test
    public void test() {
        System.out.println(2.00 - 1.10);

        System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.10")));
    }
}
