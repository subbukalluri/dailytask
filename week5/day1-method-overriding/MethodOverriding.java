/**
 * Task 2: Method Overriding
 * Each child class overrides makeSound() with its own behavior.
 */
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println(name + " makes a generic animal sound.");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Woof!");
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Meow!");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal");
        Animal dog = new Dog("Bruno");
        Animal cat = new Cat("Kitty");

        System.out.println("Parent behavior:");
        animal.makeSound();

        System.out.println("\nChild behavior (overridden):");
        dog.makeSound();
        cat.makeSound();
    }
}
