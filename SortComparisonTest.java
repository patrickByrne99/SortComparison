import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

//-------------------------------------------------------------------------
/**
 *  Test class for SortComparison.java
 *
 *  @author Patrick Byrne
 *  @version HT 2019
 */
@RunWith(JUnit4.class)
public class SortComparisonTest
{
    //~ Constructor ........................................................
    @Test
    public void testConstructor()
    {
        new SortComparison();
    }

    //~ Public Methods ........................................................

    // ----------------------------------------------------------
    /**
     * Check that the methods work for empty arrays
     */
    @Test
    public void testEmpty()
    {
        new SortComparison(); 
		double[] testArray = {};
		assertEquals("Test to see what happens when we have an empty array",0, testArray.length  );
		testArray = SortComparison.insertionSort(testArray); 
		assertEquals("Insertion empty test",0, testArray.length  );
		testArray = SortComparison.quickSort(testArray); 
		assertEquals("Quick empty test",0, testArray.length  );
		testArray = SortComparison.mergeSortRecursive(testArray); 
		assertEquals("Merge recursive empty test",0, testArray.length);
		testArray = SortComparison.mergeSortIterative(testArray); 
		assertEquals("Merge Iterative empty test",0, testArray.length );
		testArray = SortComparison.selectionSort(testArray); 
		assertEquals("Selection empty test",0, testArray.length);
    }
	
    @Test
    public void testInsertionSort() {
    	
    	double pos[] = {222.7, 24, 13, 47.2, 0, 1.9, 26, 115.5, 218.4, 218};
    	double posSorted[] = {0, 1.9, 13, 24, 26, 47.2, 115.5, 218, 218.4, 222.7};
    	assertArrayEquals(SortComparison.insertionSort(pos),posSorted,0);
    	
    	double neg[] = {-222.7, -24, -13, -47.2, 0, -1.9, -26, -115.5, -218.4, -218};
    	double negSorted[] = {-222.7, -218.4, -218, -115.5, -47.2, -26, -24, -13, -1.9, 0};
    	assertArrayEquals(SortComparison.insertionSort(neg),negSorted,0);
    
    double intDoub[] = {23.1, -49.4, 300, 4000, 369.6, 23, -116.6, 0, -342, -37};
    	double intDoubSorted[] = {-342, -116.6, -49.4, -37, 0, 23, 23.1, 300, 369.6, 4000};
    	assertArrayEquals(SortComparison.insertionSort(intDoub),intDoubSorted,0);
    
    	double back[] = {9,8,7,6,5,4,3,2,1,0};
    	double backSorted[] = {0,1,2,3,4,5,6,7,8,9};
    	assertArrayEquals(SortComparison.insertionSort(back),backSorted,0);
    }

    
     

	@Test 
    public void testQuick() 
    { 
	double pos[] = {222.7, 24, 13, 47.2, 0, 1.9, 26, 115.5, 218.4, 218};
    	double posSorted[] = {0, 1.9, 13, 24, 26, 47.2, 115.5, 218, 218.4, 222.7};
    	assertArrayEquals(SortComparison.quickSort(pos),posSorted,0);
    	
    	double neg[] = {-222.7, -24, -13, -47.2, 0, -1.9, -26, -115.5, -218.4, -218};
    	double negSorted[] = {-222.7, -218.4, -218, -115.5, -47.2, -26, -24, -13, -1.9, 0};
    	assertArrayEquals(SortComparison.quickSort(neg),negSorted,0);
    
    double intDoub[] = {23.1, -49.4, 300, 4000, 369.6, 23, -116.6, 0, -342, -37};
    	double intDoubSorted[] = {-342, -116.6, -49.4, -37, 0, 23, 23.1, 300, 369.6, 4000};
    	assertArrayEquals(SortComparison.quickSort(intDoub),intDoubSorted,0);
    
    	double back[] = {9,8,7,6,5,4,3,2,1,0};
    	double backSorted[] = {0,1,2,3,4,5,6,7,8,9};
    	assertArrayEquals(SortComparison.quickSort(back),backSorted,0);
    }
    
    @Test 
    public void testMergeIterative() 
    { 
    	double pos[] = {222.7, 24, 13, 47.2, 0, 1.9, 26, 115.5, 218.4, 218};
    	double posSorted[] = {0, 1.9, 13, 24, 26, 47.2, 115.5, 218, 218.4, 222.7};
    	assertArrayEquals(SortComparison.mergeSortIterative(pos),posSorted,0);
    	
    	double neg[] = {-222.7, -24, -13, -47.2, 0, -1.9, -26, -115.5, -218.4, -218};
    	double negSorted[] = {-222.7, -218.4, -218, -115.5, -47.2, -26, -24, -13, -1.9, 0};
    	assertArrayEquals(SortComparison.mergeSortIterative(neg),negSorted,0);
    
    double intDoub[] = {23.1, -49.4, 300, 4000, 369.6, 23, -116.6, 0, -342, -37};
    	double intDoubSorted[] = {-342, -116.6, -49.4, -37, 0, 23, 23.1, 300, 369.6, 4000};
    	assertArrayEquals(SortComparison.mergeSortIterative(intDoub),intDoubSorted,0);
    
    	double back[] = {9,8,7,6,5,4,3,2,1,0};
    	double backSorted[] = {0,1,2,3,4,5,6,7,8,9};
    	assertArrayEquals(SortComparison.mergeSortIterative(back),backSorted,0);
    }
    
    @Test 
    public void testMergeRecursive() 
    { 
    	double pos[] = {222.7, 24, 13, 47.2, 0, 1.9, 26, 115.5, 218.4, 218};
    	double posSorted[] = {0, 1.9, 13, 24, 26, 47.2, 115.5, 218, 218.4, 222.7};
    	assertArrayEquals(SortComparison.mergeSortRecursive(pos),posSorted,0);
    	
    	double neg[] = {-222.7, -24, -13, -47.2, 0, -1.9, -26, -115.5, -218.4, -218};
    	double negSorted[] = {-222.7, -218.4, -218, -115.5, -47.2, -26, -24, -13, -1.9, 0};
    	assertArrayEquals(SortComparison.mergeSortRecursive(neg),negSorted,0);
    
    double intDoub[] = {23.1, -49.4, 300, 4000, 369.6, 23, -116.6, 0, -342, -37};
    	double intDoubSorted[] = {-342, -116.6, -49.4, -37, 0, 23, 23.1, 300, 369.6, 4000};
    	assertArrayEquals(SortComparison.mergeSortRecursive(intDoub),intDoubSorted,0);
    
    	double back[] = {9,8,7,6,5,4,3,2,1,0};
    	double backSorted[] = {0,1,2,3,4,5,6,7,8,9};
    	assertArrayEquals(SortComparison.mergeSortRecursive(back),backSorted,0);
    }

    
    @Test 
    public void testSelection() 
    { 
    	double pos[] = {222.7, 24, 13, 47.2, 0, 1.9, 26, 115.5, 218.4, 218};
    	double posSorted[] = {0, 1.9, 13, 24, 26, 47.2, 115.5, 218, 218.4, 222.7};
    	assertArrayEquals(SortComparison.selectionSort(pos),posSorted,0);
    	
    	double neg[] = {-222.7, -24, -13, -47.2, 0, -1.9, -26, -115.5, -218.4, -218};
    	double negSorted[] = {-222.7, -218.4, -218, -115.5, -47.2, -26, -24, -13, -1.9, 0};
    	assertArrayEquals(SortComparison.selectionSort(neg),negSorted,0);
    
    double intDoub[] = {23.1, -49.4, 300, 4000, 369.6, 23, -116.6, 0, -342, -37};
    	double intDoubSorted[] = {-342, -116.6, -49.4, -37, 0, 23, 23.1, 300, 369.6, 4000};
    	assertArrayEquals(SortComparison.selectionSort(intDoub),intDoubSorted,0);
    
    	double back[] = {9,8,7,6,5,4,3,2,1,0};
    	double backSorted[] = {0,1,2,3,4,5,6,7,8,9};
    	assertArrayEquals(SortComparison.selectionSort(back),backSorted,0);
    }
	    
		


    // TODO: add more tests here. Each line of code and ech decision in Collinear.java should
    // be executed at least once from at least one test.

    // ----------------------------------------------------------
    /**
     *  Main Method.
     *  Use this main method to create the experiments needed to answer the experimental performance questions of this assignment.
     *
     */
    public static void main(String[] args)
    {
        //TODO: implement this method
    }

}
