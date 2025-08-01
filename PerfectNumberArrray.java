import java.util.Scanner;

public class PerfectNumberArrray {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        input(arr);
        display(arr);

        System.out.println("Perfect numbers in the array are:");
        boolean found = false;
        for (int num : arr) {
            if (isPerfect(num)) {
                System.out.println(num);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Perfect numbers found.");
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

    static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num && num != 0;
    }
}
