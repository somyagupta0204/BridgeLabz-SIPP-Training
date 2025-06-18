import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 1) return;

        int[] even = new int[n / 2 + 1], odd = new int[n / 2 + 1];
        int e = 0, o = 0;

        for (int i = 1; i <= n; i++)
            if (i % 2 == 0) even[e++] = i;
            else odd[o++] = i;

        System.out.println("Odd: " + Arrays.toString(Arrays.copyOf(odd, o)));
        System.out.println("Even: " + Arrays.toString(Arrays.copyOf(even, e)));
    }
}
