package com.learning.helper;

import org.junit.*;

public class QuickBeforeAfterTest {

    @BeforeClass
    public static void quickTest1BeforeClass() {
        System.out.println("Before Class");
    }

    @Before
    public void quickTest1Before() {
        System.out.println("quickTest1Before");
    }

    @Test
    public void quickTest1() {
        System.out.println("quickTest1");
    }

    @Test
    public void quickTest2() {
        System.out.println("quickTest2");
    }

    @After
    public void quickTest1After() {
        System.out.println("quickTest1After");
    }

    @AfterClass
    public static void quickTest1AfterClass() {
        System.out.println("After Class");
    }
}
