import java.util.Scanner;

public class Main {
    static int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter an index: ");
        int index = scanner.nextInt();

        try {
            int element = getElementAtIndex(index);
            System.out.println("Element at index " + index + " is: " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int getElementAtIndex(int index) throws ArrayIndexOutOfBoundsException {
        if (index < 0 || index >= arr.length) {
            throw new ArrayIndexOutOfBoundsException("Index is out of bounds.");
        }

        return arr[index];
    }
}
