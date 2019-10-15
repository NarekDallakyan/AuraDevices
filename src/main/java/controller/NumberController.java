package controller;

import increment.interfaces.INumber;
import increment.impl.NumberImpl;

public class NumberController {
    private INumber iNumber = new NumberImpl();

    public void start() {
        // set maximum value
        iNumber.setMaxNumber(5);
        increment();
    }

    private void increment() {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // increment
            iNumber.increment();
            // get current number value
            System.out.println(iNumber.getNumber());
        }
    }
}
