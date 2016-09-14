
import java.math.BigDecimal;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by dickdijk on 14/09/16.
 */
public class LongDivisionTest {

    @Test
    public void test() {
        System.out.println("max long:" + Long.MAX_VALUE);
        final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;
        System.out.println("MICROS_PER_DAY:" + MICROS_PER_DAY);
        final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;
        System.out.println("MILLIS_PER_DAY:" + MILLIS_PER_DAY);

        System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);
    }
}
