
	package AbstractionPackages.Packages.problem1test;

	import AbstractionPackages.Packages.problem1.Foundation;

	public class Test {

	    public static void main(String[] args) {

	        Foundation f = new Foundation();

	        // System.out.println(f.var1); // Not accessible
	        // System.out.println(f.var2); // Not accessible
	        // System.out.println(f.var3); // Not accessible

	        System.out.println(f.var4);   // Accessible
	    }
	}

