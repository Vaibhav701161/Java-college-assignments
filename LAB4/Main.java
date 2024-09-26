// Logic: Create a Person class with name and age attributes, then create two objects using a constructor and display their details.

package LAB4; 
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Raj", 28);
        Person person2 = new Person("Simran", 25);

        person1.displayPerson();
        person2.displayPerson();
    }
}