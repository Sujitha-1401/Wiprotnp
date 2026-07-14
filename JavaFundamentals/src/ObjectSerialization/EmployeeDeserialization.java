package ObjectSerialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmployeeDeserialization {

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("data");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Employee emp = (Employee) ois.readObject();

            ois.close();
            fis.close();

            System.out.println("Employee Details");
            System.out.println("-------------------------");
            System.out.println("Name        : " + emp.getName());
            System.out.println("Date of Birth : " + emp.getDateOfBirth());
            System.out.println("Department  : " + emp.getDepartment());
            System.out.println("Designation : " + emp.getDesignation());
            System.out.println("Salary      : " + emp.getSalary());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}