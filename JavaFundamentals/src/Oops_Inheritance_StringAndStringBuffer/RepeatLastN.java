package Oops_Inheritance_StringAndStringBuffer;

	import java.util.Scanner;
	public class RepeatLastN {
		public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        String str = sc.nextLine();
	        int n = sc.nextInt();

	        String last = str.substring(str.length() - n);

	        for (int i = 0; i < n; i++) {
	            System.out.print(last);

	            if (i != n - 1) {
	                System.out.print(" ");
	            }
	        }
		}

	}


