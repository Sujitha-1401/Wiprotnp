
	package AbstractionPackages.Packages.problem3.twoWheeler;

	import AbstractionPackages.Packages.problem3.com.automobile.Vehicle;

	public class Hero extends Vehicle {

	    public String getModelName() {
	        return "Hero Splendor";
	    }

	    public String getRegistrationNumber() {
	        return "AP39AB1234";
	    }

	    public String getOwnerName() {
	        return "Tasleem";
	    }

	    public int getSpeed() {
	        return 80;
	    }

	    public void radio() {
	        System.out.println("Radio is ON");
	    }
	}

