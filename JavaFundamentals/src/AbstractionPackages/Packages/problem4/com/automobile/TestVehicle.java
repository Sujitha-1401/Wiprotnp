
	package AbstractionPackages.Packages.problem4.com.automobile;

	import AbstractionPackages.Packages.problem4.fourwheeler.Logan;
	import AbstractionPackages.Packages.problem4.fourwheeler.Ford;

	public class TestVehicle {

	    public static void main(String[] args) {

	        Logan logan = new Logan();

	        System.out.println(logan.getModelName());
	        System.out.println(logan.getRegistrationNumber());
	        System.out.println(logan.getOwnerName());
	        System.out.println(logan.speed());
	        System.out.println("GPS: " + logan.gps());

	        System.out.println();

	        Ford ford = new Ford();

	        System.out.println(ford.getModelName());
	        System.out.println(ford.getRegistrationNumber());
	        System.out.println(ford.getOwnerName());
	        System.out.println(ford.speed());
	        System.out.println("Temperature: " + ford.tempControl());
	    }
	}

