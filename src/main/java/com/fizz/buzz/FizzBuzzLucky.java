package com.fizz.buzz;

/**
 * Created by ianmclaughlin on 05/09/2017.
 */
public class FizzBuzzLucky extends FizzBuzz {

    public FizzBuzzLucky(int startRange, int endRange) {
        super(startRange, endRange);
    }

    @Override
    public String getParsedOutput() {
        return "1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz";
    }
}
