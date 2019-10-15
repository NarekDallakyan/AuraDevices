package increment.interfaces;

/**
 *
 *   This Java Interface intend for implement the functionality of
 *   getNumber, increment and setMaxNumber .
 *
 *   @author Narek Dallakyan
 */
public interface INumber {
    /**
     * when call @getNumber method, return current number value
     * @return
     */
    int getNumber();

    /**
     * Increment method it is desirable synchronized, because time MultiThreading be it all good.
     */
    void increment();

    /**
     * when call setMaxNumber, check is valid
     * if number is valid, this time update maxValue corresponding number
     * @param number
     */
    void setMaxNumber(int number);
}
