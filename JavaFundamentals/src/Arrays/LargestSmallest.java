package Arrays;


	import java.util.Arrays;
	import java.util.Scanner;

	public class LargestSmallest {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the size of array: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];

	        System.out.println("Enter the array elements:");

	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        Arrays.sort(arr);

	        System.out.println("Smallest 1 = " + arr[0]);
	        System.out.println("Smallest 2 = " + arr[1]);

	        System.out.println("Largest 1 = " + arr[n - 1]);
	        System.out.println("Largest 2 = " + arr[n - 2]);

	        sc.close();
	    }
	}


