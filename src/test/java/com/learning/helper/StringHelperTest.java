package com.learning.helper;

import org.junit.*;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class StringHelperTest {

    static StringHelper stringHelper;

    /*
        To be know:
        *************************************************************************************************************
        => @Test annotation requires to be a "public void" method (* mandatory) to test a method(a unit) in a class

        => @Before annotation requires to be a "public void" method (* mandatory) to be write the setup needs to be
        done before each and every @test annotated method

        => @After annotation requires to be a "public void" method (* mandatory) to be write the setup needs to be
        done after each and every @test annotated method

        => @BeforeClass annotation requires to be a "public static void" method (* mandatory) to be write the setup needs to be
        done before current test class is loaded i.e., only runs once in a class

        => @AfterClass annotation requires to be a "public static void" method (* mandatory) to be write the setup needs to be
        done after current test class is done  i.e., only runs once in a class

        *************************************************************************************************************

        *************************************************************************************************************
        Do's:
        => Readability matters a lot
             -> Basic convention is all test methods start with "test" string and then actual method which
                going to test.
             -> have a underscore(_) after the implementing above point and write condition that you
                are going to test.

        *************************************************************************************************************
        *************************************************************************************************************
        Dont's:
        => Do not write all the test cases in one @Test method, write different test cases

        *************************************************************************************************************

     */

    @BeforeClass
    public static void setupForOnceBeforeCurrentClassIsLoadedOrTested() {
        /*
         Probably you can initiate objects before only current test class is loaded
        */
        stringHelper = new StringHelper();
    }

    @AfterClass
    public static void setupForOnceAfterCurrentClassIsLoadedOrTested() {
        /*
         Probably you can destroy objects or any other things to be done after
          only current test class is goind to closed
        */
        stringHelper = new StringHelper();
    }

    @Before
    public void beforeEachAndEveryTestAnnotatedMethod(){
        /*
         Probably you can open database connections or another tasks to be done before each and every
         @Test annotated method in current test class
        */
    }

    @After
    public void afterEachAndEveryTestAnnotatedMethod(){
        /*
         Probably you can close database connections or another tasks to be done after each and every
         @Test annotated method in current test class
        */
    }

    @Test
    public void testTruncateAInFirst2Positions_AinFirstTwoPositions() {
        /*
        "assertEquals" method uses to test the two objects
         */
        assertEquals("db", stringHelper.truncateAInFirst2Positions("AAdb"));
    }

    @Test
    public void testTruncateAInFirst2Positions_AinFirstOnePosition() {
        assertEquals("db", stringHelper.truncateAInFirst2Positions("Adb"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
        /* If you are going to test the method which returns the boolean you can use assertFalse method
        instead of assertEquals */
        assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("ABCD"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {
        /* If you are going to test the method which returns the boolean you can use assertFalse method
        instead of assertEquals */
        assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("ABAB"));
    }
}
