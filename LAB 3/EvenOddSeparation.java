// Logic: I take an input array from the user, separate the even and odd numbers, and then display the even numbers followed by the odd numbers.
import java.util.Scanner;

public class EvenOddSeparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] result = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result[index++] = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result[index++] = arr[i];
            }
        }

        System.out.println("Separated Array: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}