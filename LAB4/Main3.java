// Logic: Create a Dog class with name and breed attributes, set initial values via constructor, modify them via setter methods, and display the updated values.

package LAB4; 
class Dog {
    String name;
    String breed;

    Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    void displayDog() {
        System.out.println("Name: " + name + ", Breed: " + breed);
    }
}

public class Main3 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Max", "German Shepherd");
        Dog dog2 = new Dog("Lucy", "Beagle");

        dog1.setName("Buddy");
        dog1.setBreed("Labrador");

        dog1.displayDog();
        dog2.displayDog();
    }
}