package Arrays;


	import java.util.Scanner;

	public class EvenOdd {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();

	        int[] arr = new int[n];
	        int[] result = new int[n];

	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        int index = 0;

	        // Store even numbers
	        for (int i = 0; i < n; i++) {

	            if (arr[i] % 2 == 0) {
	                result[index++] = arr[i];
	            }
	        }

	        // Store odd numbers
	        for (int i = 0; i < n; i++) {

	            if (arr[i] % 2 != 0) {
	                result[index++] = arr[i];
	            }
	        }

	        for (int i = 0; i < n; i++) {
	            System.out.print(result[i] + " ");
	        }

	        sc.close();
	    }
	}

