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
