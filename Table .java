import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to print its multiplication table: ");
        int number = scanner.nextInt();
        
        System.out.println("Multiplication table for " + number + ":");
        
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
        
        scanner.close();
    }
}
