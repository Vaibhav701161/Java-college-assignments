package ClassTasks;

/*
Theory for StringBuffer class operations:
The StringBuffer class is used when you need a mutable string, which means you can modify the string directly without creating new string objects. It is synchronized, making it thread-safe, and is ideal when multiple modifications are needed.

Some StringBuffer operations include:
- append(): Adds a string to the end of the current string buffer.
- insert(): Inserts a string at a specified position in the string buffer.
- reverse(): Reverses the content of the string buffer.
- delete(): Removes characters from the string buffer.
- capacity(): Returns the current capacity of the buffer.

Observation: StringBuffer is highly useful when we need to modify strings frequently and avoid creating new objects each time.

Example:
- "Hello" mein " World" append karne se milega "Hello World"
- "ABCDEF" ko reverse karne pe result hoga "FEDCBA"
*/

import java.util.Scanner;

public class StringBufferOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string for StringBuffer operations: ");
        String input = scanner.nextLine();
        
        StringBuffer sb = new StringBuffer(input);
        
        System.out.println("Append '123' to string: " + sb.append("123"));
        System.out.println("Insert 'XYZ' at position 2: " + sb.insert(2, "XYZ"));
        System.out.println("Reverse the string: " + sb.reverse());
        sb.reverse(); 
        System.out.println("Delete characters from position 2 to 5: " + sb.delete(2, 5));
        System.out.println("Current buffer capacity: " + sb.capacity());
    }
}

