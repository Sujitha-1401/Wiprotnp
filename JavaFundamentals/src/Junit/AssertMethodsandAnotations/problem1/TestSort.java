package Junit.AssertMethodsandAnotations.problem1;



	import static org.junit.Assert.*;
	import org.junit.Test;

	public class TestSort {

	    @Test
	    public void testSortValues() {

	        int[] expected = {1, 2, 3, 4, 5};

	        int[] actual = MyClass.sortValues(new int[]{5, 4, 3, 2, 1});

	        assertArrayEquals(expected, actual);
	    }
	}

