package com.fizz.buzz;

import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * This class takes an instance of <code>{@link FizzBuzzLucky}</code>
 * and provides additional statistics on the number of occurrences
 * of either the word fizz, the word buzz, the word fizzbuzz, the
 * word lucky or the total number of other digits
 *
 * Created by ianmclaughlin on 05/09/2017.
 */
public class FizzBuzzLuckyStatisticsReporter {

    private int totalLucky;
    private int totalFizz;
    private int totalBuzz;
    private int totalFizzBuzz;
    private int totalNumbers;

    private FizzBuzzLucky fizzBuzzLucky;

    /**
     * Create an instance of FizzBuzzLuckyReporterStatistics
     *
     * @param fizzBuzzLucky
     */
    public FizzBuzzLuckyStatisticsReporter(FizzBuzzLucky fizzBuzzLucky) {
        this.fizzBuzzLucky = fizzBuzzLucky;

    }

    /**
     * Retrieve the parsed output that includes the original data along
     * with additional statistics
     *
     * @return
     */
    public String getParsedOutput() {
        Supplier<Stream> supplier = () -> fizzBuzzLucky.getResultStream();
        parseStatistics(supplier.get());
        StringBuilder sb = new StringBuilder();
        sb.append(fizzBuzzLucky.getParsedOutput(supplier.get()));
        sb.append(System.lineSeparator());
        sb.append("Fizz: "+totalFizz);
        sb.append(System.lineSeparator());
        sb.append("Buzz: "+totalBuzz);
        sb.append(System.lineSeparator());
        sb.append("FizzBuzz: "+totalFizzBuzz);
        sb.append(System.lineSeparator());
        sb.append("Lucky: "+totalLucky);
        sb.append(System.lineSeparator());
        sb.append("Number: "+totalNumbers);
        return sb.toString();
    }

    private void parseStatistics(Stream stream){
        stream.forEach(
                i ->{
                    if (String.valueOf(i).equals(FizzBuzzLucky.LUCKY_VALUE)){
                        totalLucky++;
                    }else if (String.valueOf(i).equals(FizzBuzzLucky.FIZZ_VALUE)){
                        totalFizz++;
                    }else if (String.valueOf(i).equals(FizzBuzzLucky.BUZZ_VALUE)){
                        totalBuzz++;
                    }
                    else if (String.valueOf(i).equals(FizzBuzzLucky.FIZZBUZZ_VALUE)){
                        totalFizzBuzz++;
                    }
                    else{
                        totalNumbers++;
                    }
                }
        );
    }

    public static void main(String[] args)
    {
        FizzBuzzLucky fizzBuzzLucky = new FizzBuzzLucky(1,20);
        FizzBuzzLuckyStatisticsReporter fizzBuzzLuckyStatisticsReporter = new FizzBuzzLuckyStatisticsReporter(fizzBuzzLucky);
        System.out.println(fizzBuzzLuckyStatisticsReporter.getParsedOutput());
    }
}
