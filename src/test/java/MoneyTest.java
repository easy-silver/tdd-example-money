import Dollar.Dollar;
import org.junit.Test;

import static org.junit.Assert.*;

public class MoneyTest {

    /**
     * Dollar의 곱셈
     */
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}
