package Oops_Inheritance.Inheritance.Problem1;

public class TestAnimal {

    public static void main(String[] args) {

        Animal a = new Animal();
        a.eat();
        a.sleep();

        System.out.println();

        Bird b = new Bird();
        b.eat();
        b.sleep();
        b.fly();
    }
}