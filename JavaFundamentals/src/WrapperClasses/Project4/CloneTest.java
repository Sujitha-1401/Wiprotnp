package WrapperClasses.Project4;

public class CloneTest {
	
		 public static void main(String[] args) throws CloneNotSupportedException {

		        Employee e1 = new Employee(101, "Tasleem", 50000);

		        Employee e2 = (Employee) e1.clone();

		        // Modify original object
		        e1.name = "Syed";
		        e1.salary = 60000;

		        System.out.println("Original Employee:");
		        e1.display();

		        System.out.println();

		        System.out.println("Cloned Employee:");
		        e2.display();
		    }

	}

