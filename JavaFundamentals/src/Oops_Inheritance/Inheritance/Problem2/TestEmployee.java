package Oops_Inheritance.Inheritance.Problem2;

public class TestEmployee {

    public static void main(String[] args) {

        Employee emp = new Employee("Sujitha", 650000, 2026, "NI123456");

        System.out.println("Name : " + emp.getName());
        System.out.println("Annual Salary : " + emp.getAnnualSalary());
        System.out.println("Year Started : " + emp.getYearStarted());
        System.out.println("National Insurance Number : " + emp.getNationalInsuranceNumber());
    }
}

