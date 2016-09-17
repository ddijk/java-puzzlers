
import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by dickdijk on 14/09/16.
 */
public class LinePrinterTest {

    @org.junit.Test
    public void main() throws Exception {
        // Note: \\u000A        is Unicode representation of linefeed (LF)
    char c = 0x000A;
        System.out.println(c);
    }

}
