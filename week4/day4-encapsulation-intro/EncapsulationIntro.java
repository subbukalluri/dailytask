/**
 * Task 4: Encapsulation Introduction
 * Private fields accessed through getters and setters.
 */
class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    // The setter can validate data, which direct field access cannot.
    public void setAge(int age) {
        if (age > 0 && age < 130) {
            this.age = age;
        } else {
            System.out.println("Invalid age: " + age + ". Age not changed.");
        }
    }
}

public class EncapsulationIntro {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Subbu");
        person.setAge(28);
        System.out.println("Name: " + person.getName());
        System.out.println("Age : " + person.getAge());

        person.setAge(-5); // rejected by the setter
        System.out.println("Age after invalid update: " + person.getAge());
    }
}
