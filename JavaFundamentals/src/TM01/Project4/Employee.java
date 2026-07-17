
	package TM01.Project4;
	import java.io.Serializable;

	public class Employee implements Serializable {

	    private static final long serialVersionUID = 1L;

	    private int empId;
	    private String empName;
	    private int age;
	    private double salary;

	    public Employee(int empId, String empName, int age, double salary) {
	        this.empId = empId;
	        this.empName = empName;
	        this.age = age;
	        this.salary = salary;
	    }

	    public int getEmpId() {
	        return empId;
	    }

	    public String getEmpName() {
	        return empName;
	    }

	    public int getAge() {
	        return age;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    @Override
	    public String toString() {
	        return empId + " " + empName + " " + age + " " + salary;
	    }
	}

