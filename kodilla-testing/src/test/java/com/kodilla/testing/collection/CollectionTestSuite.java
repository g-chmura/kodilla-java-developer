package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after() {
        System.out.println("Test Case: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //given
        OddNumberExterminator oddNumberExterminator = new OddNumberExterminator();
        List<Integer> emptyList = new ArrayList<>();
        //when
        List<Integer> exterminatedList = oddNumberExterminator.exterminate(emptyList);
        //then
        Assert.assertEquals(exterminatedList, emptyList);
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //given
        OddNumberExterminator oddNumberExterminator = new OddNumberExterminator();
        List<Integer> normalList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10));
        //when
        List<Integer> exterminatedList = oddNumberExterminator.exterminate(normalList);
        //then
        Assert.assertTrue(exterminatedList.equals(expectedList));
    }
}
