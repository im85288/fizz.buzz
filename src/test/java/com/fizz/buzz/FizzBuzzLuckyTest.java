package com.fizz.buzz;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ianmclaughlin on 05/09/2017.
 */
public class FizzBuzzLuckyTest {
    @Test
    public void testFizzBuzzLucky() throws Exception {
        FizzBuzzLucky fizzBuzzLucky = new FizzBuzzLucky(1,20);

        Assert.assertEquals("Expected 1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz","1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz",fizzBuzzLucky.getParsedOutput());
    }
}
