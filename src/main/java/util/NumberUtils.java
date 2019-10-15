package util;

/**
 * @author Narek Dallakyan
 */
public class NumberUtils {

    /**
     * It's necessary to reset the number, when the method return false value.
     * @param number -> original number
     * @param maxValue -> maximum number
     */
    public static boolean isValidRangeNumber(int number, int maxValue) {
        return number != maxValue;
    }
}
