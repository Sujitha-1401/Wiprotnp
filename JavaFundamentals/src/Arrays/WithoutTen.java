package Arrays;


	import java.util.Scanner;

	public class WithoutTen {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();

	        int[] arr = new int[n];
	        int[] result = new int[n];

	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        int index = 0;

	        for (int i = 0; i < n; i++) {

	            if (arr[i] != 10) {
	                result[index++] = arr[i];
	            }
	        }

	        for (int i = 0; i < n; i++) {
	            System.out.print(result[i] + " ");
	        }

	        sc.close();
	    }
	}


