import java.util.Scanner;

public class multipleNumberWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n>0 && n<100){
            int counter = n-1;
            while(counter > 1){
                if(n%counter==0){
                    System.out.println(counter);
                    counter--;
                }
            }
        }

    sc.close();
    }
}
