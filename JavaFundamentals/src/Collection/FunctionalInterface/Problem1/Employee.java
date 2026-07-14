package Collection.FunctionalInterface.Problem1;

public class Employee {

	    private int id;
	    private String name;
	    private String location;
	    private double salary;

	    public Employee(int id, String name, String location, double salary) {
	        this.id = id;
	        this.name = name;
	        this.location = location;
	        this.salary = salary;
	    }

	    public String getLocation() {
	        return location;
	    }
	}

