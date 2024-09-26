package ClassTasks;

/*
Theory for s1.concat(s2) and + operator:
The `concat()` method is used specifically to concatenate two strings. It works only for string objects and combines two strings without modifying the original ones.
On the other hand, the `+` operator is versatile. It can be used to concatenate strings as well as other objects like integers, characters, etc. The `+` operator first converts non-string objects into strings and then concatenates them.

Example:
- s1 = "Hello", s2 = "World"
- Using `concat()`: s1.concat(s2) karega "HelloWorld"
- Using `+`: s1 + s2 bhi "HelloWorld" dega
- Lekin agar "Hello " + 123 karoge, toh output hoga "Hello 123" jo concat ke saath possible nahi hai.

Observation: concat() is strictly for strings, while the `+` operator can handle more types and is more flexible.
*/

import java.util.Scanner;

public class ConcatVsPlus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter first string (s1): ");
        String s1 = scanner.nextLine();
        
        System.out.println("Enter second string (s2): ");
        String s2 = scanner.nextLine();
        
        System.out.println("Using concat(): " + s1.concat(s2));
        System.out.println("Using + operator: " + s1 + s2);
        System.out.println("Using + operator with a number: " + s1 + 123);
    }
}
