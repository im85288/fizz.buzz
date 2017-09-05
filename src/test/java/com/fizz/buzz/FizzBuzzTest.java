package com.fizz.buzz;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ianmclaughlin on 05/09/2017.
 */
public class FizzBuzzTest {
    @Test
    public void testOutputFizzBuzz() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz(1,20);

        Assert.assertEquals("Expected 1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz","1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz",fizzBuzz.getParsedOutput());
    }
}
