package Oops_Inheritance.Polymorphism.Problem1;

class Fruit {

    String name;
    String taste;
    String size;

    Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    void eat() {
        System.out.println("Fruit Name: " + name);
        System.out.println("Taste: " + taste);
    }
}

class Apple extends Fruit {

    Apple() {
        super("Apple", "Sweet", "Medium");
    }

    @Override
    void eat() {
        System.out.println("Fruit Name: " + name);
        System.out.println("Taste: Sweet");
    }
}

class Orange extends Fruit {

    Orange() {
        super("Orange", "Sour", "Medium");
    }

    @Override
    void eat() {
        System.out.println("Fruit Name: " + name);
        System.out.println("Taste: Sour");
    }
}

public class TestFruit {

    public static void main(String[] args) {

        Fruit a = new Apple();
        Fruit o = new Orange();

        a.eat();
        System.out.println();

        o.eat();
    }
}