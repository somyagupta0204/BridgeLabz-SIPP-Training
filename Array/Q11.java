import java.util.Scanner;

public class Q11Short {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        double[] salary = new double[n], service = new double[n], bonus = new double[n];
        double totalBonus = 0, totalOld = 0, totalNew = 0;

        for (int i = 0; i < n; ) {
            System.out.print("Salary of Emp " + (i + 1) + ": ");
            double s = sc.nextDouble();
            System.out.print("Years of Service: ");
            double y = sc.nextDouble();
            if (s <= 0 || y < 0) {
                System.out.println("Invalid input. Try again.");
                continue;
            }
            salary[i] = s;
            service[i] = y;
            bonus[i] = (y > 5) ? s * 0.05 : s * 0.02;
            totalBonus += bonus[i];
            totalOld += s;
            totalNew += (s + bonus[i]);
            i++;
        }

        System.out.println("\n--- Employee Bonus Summary ---");
        for (int i = 0; i < n; i++)
            System.out.printf("Emp %d: Old=%.2f, Bonus=%.2f, New=%.2f%n",
                    i + 1, salary[i], bonus[i], salary[i] + bonus[i]);

        System.out.printf("\nTotal Bonus: %.2f\nTotal Old Salary: %.2f\nTotal New Salary: %.2f\n",
                totalBonus, totalOld, totalNew);
    }
}
