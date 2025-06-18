import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        for (int num : numbers) {
            if (num > 0) {
                System.out.print(num + " is Positive and ");
                System.out.println((num % 2 == 0) ? "Even" : "Odd");
            } else if (num < 0) {
                System.out.println(num + " is Negative");
            } else {
                System.out.println("Number is Zero");
            }
        }

        if (numbers[0] == numbers[4]) {
            System.out.println("First and last numbers are Equal");
        } else if (numbers[0] > numbers[4]) {
            System.out.println("First number is Greater than the last");
        } else {
            System.out.println("First number is Less than the last");
        }
    }
}
