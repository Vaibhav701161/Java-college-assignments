// Logic: Create a Student class with name and roll_no attributes, assign values using a constructor, and display the details.
package LAB4; 
class Student {
    String name;
    int roll_no;

    Student(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

    void displayStudent() {
        System.out.println("Name: " + name + ", Roll No: " + roll_no);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Student student = new Student("John", 2);
        student.displayStudent();
    }
}