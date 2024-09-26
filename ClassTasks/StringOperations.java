package ClassTasks;

/*
Theory for 5-6 string operations:
In this program, we will explore common string operations like:
- str.length(): Returns the length of the string.
- str.toLowerCase(): Converts the entire string to lowercase.
- str.toUpperCase(): Converts the entire string to uppercase.
- str.trim(): Removes extra spaces from the start and end of the string.
- str.substring(): Extracts a specific part of the string.
- str.replace(): Replaces all occurrences of a character with another one.

Observation: These string operations are commonly used for string manipulation tasks.

Example:
- "HELLO WORLD" ko lowercase mein convert karne se result hoga "hello world"
- "    Trim this!    " ke spaces trim karne pe result hoga "Trim this!"
*/

import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();
        
        System.out.println("String length: " + str.length());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Trimmed string: '" + str.trim() + "'");
        System.out.println("Substring (2 to 5): " + str.substring(2, 5));
        System.out.println("Replaced 'a' with 'e': " + str.replace('a', 'e'));
    }
}
