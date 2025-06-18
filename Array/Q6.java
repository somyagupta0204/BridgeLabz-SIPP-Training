import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 6; i <= 9; i++)
            for (int j = 1; j <= 10; j++)
                System.out.println(i + " * " + n + " = " + (i * n));
    }
}
