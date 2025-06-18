import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] nums = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            System.out.print("Enter number: ");
            double num = sc.nextDouble();
            if (num <= 0 || index == 10) break;
            nums[index++] = num;
        }

        for (int i = 0; i < index; i++) {
            System.out.println("Number " + (i + 1) + ": " + nums[i]);
            total += nums[i];
        }

        System.out.println("Total = " + total);
    }
}
