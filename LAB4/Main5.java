
// Logic: Create a Triangle class and calculate area and perimeter using both default and parameterized constructors.

package LAB4;

class Triangle {
    int a, b, c;

    Triangle() {
        a = 3;
        b = 4;
        c = 5;
    }

    Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double area() {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    int perimeter() {
        return a + b + c;
    }

    void display() {
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }
}

public class Main5 {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle();
        triangle1.display();

        Triangle triangle2 = new Triangle(6, 8, 10);
        triangle2.display();
    }
}