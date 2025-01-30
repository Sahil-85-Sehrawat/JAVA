import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int subject1, subject2, subject3, subject4, subject5;
        
        System.out.print("Enter marks for Subject 1: ");
        subject1 = scanner.nextInt();
        
        System.out.print("Enter marks for Subject 2: ");
        subject2 = scanner.nextInt();
        
        System.out.print("Enter marks for Subject 3: ");
        subject3 = scanner.nextInt();
        
        System.out.print("Enter marks for Subject 4: ");
        subject4 = scanner.nextInt();
        
        System.out.print("Enter marks for Subject 5: ");
        subject5 = scanner.nextInt();
        
        int sum = subject1 + subject2 + subject3 + subject4 + subject5;
        
        double average = sum / 5.0;  
        
        String section;
        if (average >= 90) {
            section = "A";
        } else if (average >= 80) {
            section = "B";
        } else if (average >= 70) {
            section = "C";
        } else if (average >= 60) {
            section = "D";
        } else {
            section = "F";  
        }
        
        System.out.println("Sum of the marks: " + sum);
        System.out.println("Average of the marks: " + average);
        System.out.println("Grade section: " + section);
        
        scanner.close();
    }
}
