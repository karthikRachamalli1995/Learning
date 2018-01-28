package com.learning.helper;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class ArraysCompareTest {

    @Test
    public void testArraySort_RandomArray(){
        int[] numbers = {4,5,2,9};
        int[] expected = {2,4,5,9};
        Arrays.sort(numbers);
        assertArrayEquals(expected,numbers);
    }
}
