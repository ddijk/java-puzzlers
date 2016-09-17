
import java.util.Arrays;
import java.util.List;
import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by dickdijk on 14/09/16.
 */
public class TweedledumTest {

    @org.junit.Test
    public void main() throws Exception {

        System.out.println("2 + 2 =" + 2 + 2);
        System.out.printf("%c%c\n", 'H', 'a');
        int[] ia = {1, 2, 3};
        List<Integer> il = Arrays.asList(1, 2, 3);

        char[] num = {'1', '2', '3'};
        System.out.println("ia=" + ia);
        System.out.println(num);
    }

}
