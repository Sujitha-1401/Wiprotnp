package Oops_Inheritance.Optionalclass;

import java.util.Optional;

public class OptionalExample3 {

    public static void main(String[] args) {

        Employee emp = null;

        try {

            Employee employee = Optional.ofNullable(emp)
                    .orElseThrow(() ->
                            new InvalidEmployeeException("Employee is null"));

            employee.display();

        } catch (InvalidEmployeeException e) {
            System.out.println(e.getMessage());
        }
    }
}