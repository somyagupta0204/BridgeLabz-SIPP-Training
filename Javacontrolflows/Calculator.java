import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double first, second;
        String op;

        // Input values
        System.out.print("Enter first number: ");
        first = sc.nextDouble();
        System.out.print("Enter second number: ");
        second = sc.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        op = sc.next();

        switch (op) {
            case "+":
                System.out.println("Result: " + (first + second));
                break;
            case "-":
                System.out.println("Result: " + (first - second));
                break;
            case "*":
                System.out.println("Result: " + (first * second));
                break;
            case "/":
                if (second != 0)
                    System.out.println("Result: " + (first / second));
                else
                    System.out.println("Cannot divide by zero.");
                break;
            default:
                System.out.println("Invalid Operator");
        }

        sc.close();
    }
}
