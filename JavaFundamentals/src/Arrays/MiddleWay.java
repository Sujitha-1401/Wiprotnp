package Arrays;


	import java.util.Scanner;

	public class MiddleWay {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        int[] a = new int[3];
	        int[] b = new int[3];

	        for (int i = 0; i < 3; i++) {
	            a[i] = sc.nextInt();
	        }

	        for (int i = 0; i < 3; i++) {
	            b[i] = sc.nextInt();
	        }

	        int[] result = {a[1], b[1]};

	        for (int i = 0; i < result.length; i++) {
	            System.out.print(result[i] + " ");
	        }

	        sc.close();
	    }
	}

