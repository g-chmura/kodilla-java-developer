package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        int[] numbers = {};

        double testResult = ArrayOperations.getAverage(numbers);
        Assert.assertEquals(testResult, 0, 0);
    }
}