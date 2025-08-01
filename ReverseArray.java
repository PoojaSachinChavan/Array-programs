import java.util.Scanner;

public class ReverseArray {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        input(arr);
        display(arr);
        reverseEach(arr);

        System.out.println("Array after reversing each number:");
        display(arr);

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

    public static int reverseNumber(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }

    public static void reverseEach(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = reverseNumber(arr[i]);
        }
    }

}