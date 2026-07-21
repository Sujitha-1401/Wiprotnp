package Junit.AssertMethodsandAnotations.problem2;


	import java.util.Arrays;

	public class MyClass {

	    // Method for TestSort
	    public static int[] sortValues(int[] arr) {
	        Arrays.sort(arr);
	        return arr;
	    }

	    // Method for TestCheckPresence
	    public static boolean checkPresence(int[] arr, int value) {

	        for (int num : arr) {
	            if (num == value) {
	                return true;
	            }
	        }

	        return false;
	    }
	}

