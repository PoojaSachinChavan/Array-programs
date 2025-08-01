import java.util.Scanner;

public class StrongArray {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        input(arr);
        display(arr);

        System.out.println("Strong numbers in the array are:");
        boolean found = false;
        for (int num : arr) {
            if (isStrong(num)) {
                System.out.println(num);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Strong numbers found.");
        }
    }

    public static void input(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the array element:");
            arr[i] = sc.nextInt();
        }
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element in array: " + arr[i]);
        }
    }

    static boolean isStrong(int num) {
        int n = num, sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += factorial(digit);
            n /= 10;
        }
        return sum == num;
    }

    static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
