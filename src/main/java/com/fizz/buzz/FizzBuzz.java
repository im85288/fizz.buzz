package com.fizz.buzz;

import java.io.Serializable;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * This class takes in a start and end range integer and proceeds
 * to parse that range replacing any numbers divisible by 3 with
 * the word fizz, any numbers divisible by 5 with the word buzz and
 * any numbers divisible by both 3 and 5 with the word fizzbuzz
 *
 * Created by ianmclaughlin on 05/09/2017.
 */
public class FizzBuzz {

    private int startRange;
    private int endRange;

    private static final int fizz = 3;
    private static final int buzz = 5;

    public static final String FIZZ_VALUE = "fizz";
    public static final String BUZZ_VALUE = "buzz";
    public static final String FIZZBUZZ_VALUE = "fizzbuzz";

    /**
     * Create an instance of FizzBuzz supplying the start and
     * end range
     *
     * @param startRange
     * @param endRange
     */
    public FizzBuzz(int startRange, int endRange) {
        this.startRange = startRange;
        this.endRange = endRange;
    }

    /**
     * Retrieve the parsed output for this fizz buzz instance
     *
     * @return - String
     */
    public String getParsedOutput() {
        Stream stream = getResultStream();
        return dumpResult(stream);
    }

    /**
     * Takes a stream and delimits it with spaces before returning that
     * delimited string
     *
     * @param stream
     * @return
     */
    public String dumpResult(Stream stream){
        StringBuilder sb = new StringBuilder();
        sb.append(stream.map(i -> i.toString()).collect(Collectors.joining(" ")));
        return sb.toString();
    }

    protected Serializable getValue(int i) {
        return i % fizz == 0 ? (i % buzz == 0 ? FIZZBUZZ_VALUE : FIZZ_VALUE) : (i % buzz == 0 ? BUZZ_VALUE : i);
    }

    private IntFunction<? extends Serializable> getResult() {
        return i -> getValue(i);
    }

    private Stream getResultStream() {
        return IntStream.rangeClosed(startRange, endRange)
                .mapToObj(getResult());
    }

    public static void main(String[] args)
    {
        FizzBuzz fizzBuzz = new FizzBuzz(1,20);
        System.out.println(fizzBuzz.getParsedOutput());
    }
}
