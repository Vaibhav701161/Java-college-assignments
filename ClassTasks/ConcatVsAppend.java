package ClassTasks;

/*
Theory for concat vs append:
The `concat()` method is specific to strings and is used to concatenate two string objects. Once strings are concatenated using `concat()`, it returns a new string without modifying the original ones.
The `append()` method is part of the StringBuffer class, allowing you to append strings to an existing string buffer object. The original buffer is modified, and no new object is created.

Observation: concat() is immutable, while append() modifies the original string buffer.

Example:
- concat() mein agar "Hello".concat(" World") likhenge, toh milega "Hello World" without changing the original "Hello".
- append() mein "Hello".append(" World") karega "Hello World" aur original string buffer modify hoga.
*/

import java.util.Scanner;

public class ConcatVsAppend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter first string: ");
        String str1 = scanner.nextLine();
        
        System.out.println("Enter second string: ");
        String str2 = scanner.nextLine();
        
        System.out.println("Using concat(): " + str1.concat(str2));
        
        StringBuffer sb = new StringBuffer(str1);
        System.out.println("Using append(): " + sb.append(str2));
    }
}
