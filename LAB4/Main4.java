package LAB4;

// Logic: Create a Student class with additional attributes for phone number and address, create two objects with different values, and display their details.
class Student {
    String name;
    int roll_no;
    String phoneNumber;
    String address;

    Student(String name, int roll_no, String phoneNumber, String address) {
        this.name = name;
        this.roll_no = roll_no;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    void displayStudent() {
        System.out.println("Name: " + name + ", Roll No: " + roll_no + ", Phone: " + phoneNumber + ", Address: " + address);
    }
}

public class Main4 {
    public static void main(String[] args) {
        Student student1 = new Student("Sam", 1, "9876543210", "Delhi");
        Student student2 = new Student("John", 2, "9123456780", "Mumbai");

        student1.displayStudent();
        student2.displayStudent();
    }
}