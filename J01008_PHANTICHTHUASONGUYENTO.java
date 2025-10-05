import java.util.Scanner;

public class J01008_PHANTICHTHUASONGUYENTO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t = 1; t <= T; t++){
            int n = sc.nextInt();
            System.out.println("Test "+ t +": " );
            factor(n);
            System.out.println();
        }
    }

    public static void factor(int n){

        for(int i = 2; i <= Math.sqrt(n); i++){
            int count = 0;
            while( n % i == 0){
                count += 1;
                n /= i;
            }
            if(count > 0){
                System.out.println(i + "(" + count + ") ");
            }
            if(n > 1){
                System.out.println(n + "(1)");
            }
        }
    }
}
