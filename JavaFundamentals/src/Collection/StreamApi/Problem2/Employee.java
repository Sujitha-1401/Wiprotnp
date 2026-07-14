
	package Collection.StreamApi.Problem2;
	public class Employee {

	    private int empNo;
	    private String name;
	    private int age;
	    private String location;

	    public Employee(int empNo, String name, int age, String location) {
	        this.empNo = empNo;
	        this.name = name;
	        this.age = age;
	        this.location = location;
	    }

	    public String getLocation() {
	        return location;
	    }

	    public String toString() {
	        return empNo + " " + name + " " + age + " " + location;
	    }
	}

