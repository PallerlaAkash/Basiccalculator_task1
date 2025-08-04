import java.util.Scanner;
public class Calculator {
public static double add(double x, double y) {
    return x+y;
}
 public static double subtract(double x, double y) {
return x-y;
 }
 public static double multiply(double x, double y) {
     return x * y;
 }
  public static double divide(double x, double y) {
if (y==0) {
    System.out.println("Error :Cannot divide by Zero.");
    return 0;
}
return x / y;
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("\n--- Basic calculator ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                keepRunning = false;
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

            System.out.print("Enter x value: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter y value: ");
            double num2 = scanner.nextDouble();

            double result = 0;
            switch (choice) {
                case 1:
                    result = add(num1, num2);
                    break;
                case 2:
                    result = subtract(num1, num2);
                    break;
                case 3:
                    result = multiply(num1, num2);
                    break;
                case 4:
                    result = divide(num1, num2);
                    break;
                default:
                    System.out.println("Option is Invalid.");
                    continue;
            }

            System.out.println("Result: " + result);
        }

        scanner.close();
    }
 }

