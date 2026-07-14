
	package AbstractionPackages.InterfacesNewFeatures.problem1;
	public class Car implements Vehicle, FourWheeler {

	    @Override
	    public void message() {
	        Vehicle.super.message();
	        FourWheeler.super.message();
	        System.out.println("Inside Car");
	    }
	}

