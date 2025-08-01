import java.util.Scanner;

public class Neon {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter the size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        Input(arr);
        Display(arr);

        System.out.println("Neon numbers in the array are:");
        boolean found = false;
        for (int num : arr) {
            if (isNeon(num)) {
                System.out.println(num);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Neon numbers found.");
        }
    }

    public static void Input(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the array elements:");
            arr[i] = sc.nextInt();
        }
    }

    public static void Display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("elements in array are: " + arr[i]);
        }
    }

    // Function to check if a number is Neon
    static boolean isNeon(int num) {
        int square = num * num;
        int sum = 0;

        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }

        return sum == num;
    }
}
