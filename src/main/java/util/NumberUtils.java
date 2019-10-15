package util;

public class NumberUtils {

    /**
     * This method when to return false, then it is necessary number reset.
     * @param number -> original number
     * @param maxValue -> maximum number
     */
    public static boolean isValidRangeNumber(int number, int maxValue) {
        return number != maxValue;
    }
}
