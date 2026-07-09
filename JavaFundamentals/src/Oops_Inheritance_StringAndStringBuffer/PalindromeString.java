package Oops_Inheritance_StringAndStringBuffer;


	import java.util.Scanner;

	public class PalindromeString {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			String str = sc.nextLine();

	        String rev = "";

	        for (int i = str.length() - 1; i >= 0; i--) {
	            rev += str.charAt(i);
	        }

	        if (str.equals(rev)) {
	            System.out.println("Palindrome");
	        } else {
	            System.out.println("Not Palindrome");
	        }

		}

	}


