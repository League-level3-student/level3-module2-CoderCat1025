package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */

    @Test
    public void testLinearSearch() {
        // 1. Use the assertEquals() method to test your linear search method
    	String[] strings = {"a", "word", "apple", "something", "string"};
        assertEquals(3, _01_LinearSearch.linearSearch(strings, "something"));
        
        assertEquals(-1, _01_LinearSearch.linearSearch(strings, "your mom"));
    }

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
    	int[] ints = {1, 21, 56, 123, 1293, 48129, 421932};
        assertEquals(3, _02_BinarySearch.binarySearch(ints, 0, ints.length-1, 123));
        
        assertEquals(-1, _02_BinarySearch.binarySearch(ints, 0, ints.length-1, 999));
    }
}
