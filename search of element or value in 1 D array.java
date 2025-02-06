import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter element to search: ");
        int searchElement = scanner.nextInt();

        boolean found = false;
        for (int num : array) {
            if (num == searchElement) {
                found = true;
                break;
            }
        }

        System.out.println(found ? "Element found in the array" : "Element not found in the array");

        scanner.close();
    }
}
