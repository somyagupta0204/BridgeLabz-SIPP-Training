import java.util.Scanner;

public class Q14Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] digits = new int[10];
        int index = 0;
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        while (num > 0 && index < 10) {
            digits[index++] = num % 10;
            num /= 10;
        }

        int max1 = -1, max2 = -1;
        for (int i = 0; i < index; i++) {
            if (digits[i] > max1) {
                max2 = max1;
                max1 = digits[i];
            } else if (digits[i] > max2 && digits[i] != max1) {
                max2 = digits[i];
            }
        }

        System.out.println("Largest: " + max1 + ", Second Largest: " + max2);
    }
}
