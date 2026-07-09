package Oops_Inheritance.StringJoinerClass;

import java.util.Scanner;
import java.util.StringJoiner;

public class ArrayList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        java.util.ArrayList<String> list = new java.util.ArrayList<>();

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter names:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLine());
        }

        StringJoiner sj = new StringJoiner(",", "{", "}");

        for (String name : list) {
            sj.add(name);
        }

        System.out.println(sj);

        sc.close();
    }
}