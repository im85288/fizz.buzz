package com.fizz.buzz;

import java.io.Serializable;

/**
 * This class extends the FizzBuzz class by replacing any number that
 * contains a 3 with the word lucky
 *
 * Created by ianmclaughlin on 05/09/2017.
 */
public class FizzBuzzLucky extends FizzBuzz {

    private static final int lucky = 3;

    public static final String LUCKY_VALUE = "lucky";

    /**
     * Create an instance of FizzBuzzLucky with start
     * and end range
     *
     * @param startRange
     * @param endRange
     */
    public FizzBuzzLucky(int startRange, int endRange) {
        super(startRange, endRange);
    }

    @Override
    protected Serializable getValue(int i) {
        return String.valueOf(i).contains(String.valueOf(lucky)) ? LUCKY_VALUE : super.getValue(i);
    }

    public static void main(String[] args)
    {
        FizzBuzzLucky fizzBuzzLucky = new FizzBuzzLucky(1,20);
        System.out.println(fizzBuzzLucky.getParsedOutput());
    }
}
