
import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by dickdijk on 14/09/16.
 */
public class EscapeRoutTest {

    @org.junit.Test
    public void main() throws Exception {
        System.out.println("a\u0022.length() + \u0022b".length());
    }

}
