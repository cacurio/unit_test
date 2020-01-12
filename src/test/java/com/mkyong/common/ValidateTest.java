package com.mkyong.common;

import org.junit.Assert;
import org.junit.Test;

import static com.mkyong.common.Validate.Level.*;
import static org.junit.Assert.*;

public class ValidateTest {

    @Test
    public void validatePassword() {
        Assert.assertEquals(LOW, Validate.validatePassword("Hola"));
    }

}