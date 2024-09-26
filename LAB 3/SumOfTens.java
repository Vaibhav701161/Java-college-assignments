// Logic: I take input for the array from the user, then check if the sum of all 10's equals 30 by summing only the 10's.
import java.util.Scanner;

public class SumOfTens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 10) {
                sum += arr[i];
            }
        }
        System.out.println(sum == 30);
    }
}
