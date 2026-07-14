
	package WrapperClasses.Project4;

	public class Employee implements Cloneable {

	    int id;
	    String name;
	    double salary;

	    Employee(int id, String name, double salary) {
	        this.id = id;
	        this.name = name;
	        this.salary = salary;
	    }

	    @Override
	    protected Object clone() throws CloneNotSupportedException {
	        return super.clone();
	    }

	    void display() {
	        System.out.println("ID: " + id);
	        System.out.println("Name: " + name);
	        System.out.println("Salary: " + salary);
	    }
	}

