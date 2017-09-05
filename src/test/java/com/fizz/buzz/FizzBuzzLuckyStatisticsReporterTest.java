package com.fizz.buzz;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ianmclaughlin on 05/09/2017.
 */
public class FizzBuzzLuckyStatisticsReporterTest {
    @Test
    public void testFizzBuzzLuckyStatisticsReporter() throws Exception {
        FizzBuzzLucky fizzBuzzLucky = new FizzBuzzLucky(1,20);
        FizzBuzzLuckyStatisticsReporter fizzBuzzLuckyStatisticsReporter = new FizzBuzzLuckyStatisticsReporter(fizzBuzzLucky);

        Assert.assertEquals("Expected 1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz\n" +
                "Fizz: 4\n" +
                "Buzz: 3\n" +
                "FizzBuzz: 1\n" +
                "Lucky: 2\n" +
                "Number: 10","1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz\n" +
                        "Fizz: 4\n" +
                        "Buzz: 3\n" +
                        "FizzBuzz: 1\n" +
                        "Lucky: 2\n" +
                        "Number: 10",

                fizzBuzzLuckyStatisticsReporter.getParsedOutput());
    }
}
