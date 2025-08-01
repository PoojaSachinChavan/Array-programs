import java.util.Scanner;

public class ArrayExponent {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        input(arr);
        display(arr);
        exponent(arr, n);
    }

    public static void input(int[] arr) {
        System.out.println("Enter " + arr.length + " elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void display(int[] arr) {
        System.out.print("Array elements: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void exponent(int[] arr, int n) {
        System.out.println("Exponent of each element:");
        for (int i = 0; i < n; i++) {

            int exp = sc.nextInt();
            int result = 1;
            for (int j = 0; j < exp; j++) {
                result *= arr[i];
            }
            System.out.println("Element: " + arr[i] + ", Exponent: " + exp + ", Result: " + result);
        }

    }
}