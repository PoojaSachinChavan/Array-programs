import java.util.Scanner;

public class AutomorphicgArray {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        input(arr);
        display(arr);
        System.out.println("Automorphic numbers in the array:");
        boolean found = false;

        for (int num : arr) {
            if (isAutomorphic(num)) {
                System.out.println(num);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Automorphic numbers found.");
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

    public static boolean isAutomorphic(int num) {
        int square = num * num;
        int n = num;

        while (n > 0) {
            if (n % 10 != square % 10){
                return false;
            }
            n /= 10;
            square /= 10;
        }

        return true;
    }
}