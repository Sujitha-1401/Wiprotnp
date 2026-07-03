package Arrays;


	import java.util.Scanner;

	public class Sum67 {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();

	        int[] arr = new int[n];

	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        int sum = 0;
	        boolean ignore = false;

	        for (int i = 0; i < n; i++) {

	            if (arr[i] == 6) {
	                ignore = true;
	            }

	            if (!ignore) {
	                sum += arr[i];
	            }

	            if (ignore && arr[i] == 7) {
	                ignore = false;
	            }
	        }

	        System.out.println(sum);

	        sc.close();
	    }
	}


