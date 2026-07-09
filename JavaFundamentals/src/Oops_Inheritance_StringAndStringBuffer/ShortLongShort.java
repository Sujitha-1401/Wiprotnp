package Oops_Inheritance_StringAndStringBuffer;


	import java.util.*;
	public class ShortLongShort {
		public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        String a = sc.nextLine();
	        String b = sc.nextLine();

	        if (a.length() < b.length()) {
	            System.out.println(a + b + a);
	        } else {
	            System.out.println(b + a + b);
	        }
		}

	}

