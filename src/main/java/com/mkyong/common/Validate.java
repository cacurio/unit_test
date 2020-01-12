package com.mkyong.common;

public class Validate {

    public enum Level {
        LOW, MEDIUM, STRONG
    }

    public static Level validatePassword(String password) {
        return Level.LOW;
    }
}
