import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] res = new String[n + 1];

        for (int i = 0; i <= n; i++)
            res[i] = (i % 3 == 0 && i % 5 == 0) ? "FizzBuzz" :
                     (i % 3 == 0) ? "Fizz" :
                     (i % 5 == 0) ? "Buzz" : String.valueOf(i);

        for (int i = 0; i <= n; i++)
            System.out.println("Position " + i + " = " + res[i]);
    }
}
