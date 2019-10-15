package increment.interfaces;

/**
 *
 *   This Java Interface is intended to work on a number increment,
 *   getNumber and setMaxNumber functional for implement.
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
     * when call increment method, increment number value
     */
    void increment();

    /**
     * when call setMaxNumber, check is valid
     * if number is valid, this time update maxValue corresponding number
     * @param number
     */
    void setMaxNumber(int number);
}
