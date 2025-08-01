import java.util.Scanner;

public class ArmstrongArray {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        input(arr);
        display(arr);

        System.out.println("Armstrong numbers in the array are:");
        boolean found = false;
        for (int num : arr) {
            if (isArmstrong(num)) {
                System.out.println(num);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Armstrong numbers found.");
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

    static boolean isArmstrong(int num) {
        int digit, sum = 0;

        while (n != 0) {
            digit = n % 10;
            sum = sum + (digit * digit * digit);
            n = n / 10;
        }

        return sum == num;
    }
}
