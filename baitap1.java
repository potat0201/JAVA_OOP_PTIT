import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long tong = 0;
        while(t-- > 0){
            int n = sc.nextInt();
            tong += tinh(n);

        }
        System.out.println(tong);
    }
    public static long tinh(int n){
        long sum = 0;
        for(int i = 2; i <= Math.sqrt(n); i++){
            while( n % i == 0){
                sum += i;
                n /= i;
            }
        }
        if(n > 1){
            sum += n;
        }
        return sum;
    }
}
