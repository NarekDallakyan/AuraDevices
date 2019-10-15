package increment.impl;

import increment.interfaces.INumber;
import util.NumberUtils;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 */
public class NumberImpl implements INumber {
    private int maxValue;
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    @Override
    public int getNumber() {
        return atomicInteger.get();
    }

    @Override
    public synchronized void increment() {
        // check number is valid or not
        if (NumberUtils.isValidRangeNumber(atomicInteger.get(), maxValue))
            // update old number to incremented number
            atomicInteger.set(atomicInteger.incrementAndGet());
        else
            // release number
            atomicInteger.set(0);
    }

    @Override
    public void setMaxNumber(int number) {
        // save max number
        maxValue = number;
    }
}
