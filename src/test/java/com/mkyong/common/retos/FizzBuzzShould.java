package com.mkyong.common.retos;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzShould {

    @Test
    public void return_fizz_when_input_number_is_divisible_by_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.calculate(9), CoreMatchers.equalTo("Fizz"));
    }

    @Test
    public void return_fizz_when_input_number_is_divisible_by_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.calculate(25), CoreMatchers.equalTo("Buzz"));
    }

    @Test
    public void return_fizz_when_input_number_is_divisible_by_3_and_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.calculate(60), CoreMatchers.equalTo("FizzBuzz"));
    }
}