import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        
        int choice = scanner.nextInt();
        
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        double result = 0;
        
        switch (choice) {
            case 1: // Addition
                result = num1 + num2;
                System.out.println("Result of addition: " + result);
                break;
                
            case 2: // Subtraction
                result = num1 - num2;
                System.out.println("Result of subtraction: " + result);
                break;
                
            case 3: // Multiplication
                result = num1 * num2;
                System.out.println("Result of multiplication: " + result);
                break;
                
            case 4: // Division
                if (num2 != 0) { // Checking for division by zero
                    result = num1 / num2;
                    System.out.println("Result of division: " + result);
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                }
                break;
                
            default:
                System.out.println("Invalid choice! Please select a valid operation.");
                break;
        }
        
        scanner.close();
    }
}

