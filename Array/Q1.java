import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), size = 10, idx = 0;
        int[] factors = new int[size];

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                if (idx == size) {
                    size *= 2;
                    factors = Arrays.copyOf(factors, size);
                }
                factors[idx++] = i;
            }
        }
        System.out.println("Factors: " + Arrays.toString(Arrays.copyOf(factors, idx)));
    }
}
