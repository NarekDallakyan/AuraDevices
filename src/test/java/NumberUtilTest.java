import org.junit.Test;

import static org.junit.Assert.*;

public class NumberUtilTest {

    @Test
    public void validNumber_False() {
        int number = 0;
        int maxNumber = 0;
        assertFalse(isValidRangeNumber(number, maxNumber));
    }

    @Test
    public void validNumber_True() {
        int number = 0;
        int maxNumber = 5;
        assertTrue(isValidRangeNumber(number, maxNumber));
    }

    private boolean isValidRangeNumber(int number, int maxValue) {
        return number != maxValue;
    }

}
