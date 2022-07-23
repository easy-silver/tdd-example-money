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
        Dollar product = five.times(2);
        assertEquals(10, product.amount);
        product = five.times(3);
        assertEquals(15, product.amount);
    }

    @Test
    public void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
    }
}
