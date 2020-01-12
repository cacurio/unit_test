package com.mkyong.common.retos;

public class FizzBuzz {

    public String calculate(Integer value) {

        if (value % 3 == 0 && value % 5 == 0) {
            return "FizzBuzz";
        }
        if (value % 3 == 0) {
            return "Fizz";
        } else if (value % 5 == 0) {
            return "Buzz";
        }


        return value.toString();
    }

}
