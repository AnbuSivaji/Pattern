
import java.util.Scanner;


public class Find_missing {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int total = (n + 1) * (n + 2) / 2;
        int missingNumber = total - sum;
        System.out.println("The missing number is: " + missingNumber); // Output: The missing number is: 10
    // The missing number is: 10
    }
    

}
