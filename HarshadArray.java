import java.util.Scanner;

public class HarshadArray {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        input(arr);
        display(arr);

        System.out.println("Harshad numbers in array:");
        HarshadNumbers(arr);
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

    public static boolean isHarshad(int num) {
        int sum = 0, temp = num;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return (sum != 0 && num % sum == 0);
    }

    public static void HarshadNumbers(int[] arr) {
        boolean found = false;
        for (int num : arr) {
            if (isHarshad(num)) {
                System.out.print(num + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No Harshad numbers found.");
        }
    }
}