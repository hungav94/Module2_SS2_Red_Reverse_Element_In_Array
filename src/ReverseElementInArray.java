import java.util.Scanner;

public class ReverseElementInArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = sc.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);

        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        System.out.print("Element in array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        System.out.print("\nReverse Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }

}
