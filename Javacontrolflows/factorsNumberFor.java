import java.util.Scanner;

public class factorsNumberFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0){
            for(int i=1;i<n;i++){
                if(n%i==0){
                    System.out.println(i);
                }
            }
        }
    }
}
