
	package TM01.Project4;

	import java.io.*;
	import java.util.ArrayList;

	public class EmployeeOperations {

	    private final String fileName = "employee.dat";

	    public void addEmployee(Employee emp) {

	        ArrayList<Employee> list = getEmployees();

	        list.add(emp);

	        try {
	            ObjectOutputStream oos =
	                    new ObjectOutputStream(new FileOutputStream(fileName));

	            oos.writeObject(list);

	            oos.close();

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    @SuppressWarnings("unchecked")
	    public ArrayList<Employee> getEmployees() {

	        File file = new File(fileName);

	        if (!file.exists())
	            return new ArrayList<>();

	        try {

	            ObjectInputStream ois =
	                    new ObjectInputStream(new FileInputStream(fileName));

	            ArrayList<Employee> list =
	                    (ArrayList<Employee>) ois.readObject();

	            ois.close();

	            return list;

	        } catch (Exception e) {
	            return new ArrayList<>();
	        }
	    }

	    public void displayEmployees() {

	        ArrayList<Employee> list = getEmployees();

	        System.out.println("-----Report-----");

	        for (Employee e : list) {
	            System.out.println(e);
	        }

	        System.out.println("-----End of Report-----");
	    }
	}

