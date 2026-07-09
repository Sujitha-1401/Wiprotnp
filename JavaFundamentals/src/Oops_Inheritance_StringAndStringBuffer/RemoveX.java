package Oops_Inheritance_StringAndStringBuffer;



	import java.util.*;
	public class RemoveX {
		 public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        String str = sc.nextLine();

		        if (str.startsWith("x")) {
		            str = str.substring(1);
		        }

		        if (str.endsWith("x")) {
		            str = str.substring(0, str.length() - 1);
		        }

		        System.out.println(str);
		 }
	}

