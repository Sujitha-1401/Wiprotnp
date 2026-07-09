package Oops_Inheritance.StringJoinerClass;

import java.util.Scanner;
import java.util.StringJoiner;

public class Citynames {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of cities in s1: ");
        int n1 = sc.nextInt();
        sc.nextLine();

        StringJoiner s1 = new StringJoiner("-");

        System.out.println("Enter cities for s1:");
        for (int i = 0; i < n1; i++) {
            s1.add(sc.nextLine());
        }

        System.out.print("Enter number of cities in s2: ");
        int n2 = sc.nextInt();
        sc.nextLine();

        StringJoiner s2 = new StringJoiner("-");

        System.out.println("Enter cities for s2:");
        for (int i = 0; i < n2; i++) {
            s2.add(sc.nextLine());
        }

       
        StringJoiner join1 = new StringJoiner("-");
        join1.add(s1.toString());

        StringJoiner join2 = new StringJoiner("-");
        join2.add(s2.toString());

        
        join2.merge(s1);
        System.out.println("\ns1 merged to s2:");
        System.out.println(join2);

       
        join1.merge(s2);
        System.out.println("\ns2 merged to s1:");
        System.out.println(join1);

        sc.close();
    }
}