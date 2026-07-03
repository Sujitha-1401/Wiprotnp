package Arrays;


	import java.util.Scanner;

	public class SumAverage {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the size of array: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];

	        int sum = 0;

	        System.out.println("Enter the array elements:");

	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	            sum += arr[i];
	        }

	        double avg = (double) sum / n;

	        System.out.println("Sum = " + sum);
	        System.out.println("Average = " + avg);

	        sc.close();
	    }
	}


