import java.util.Scanner;

public class J01013_TONGUOCSO_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long sum = 0;
        while(t-- > 0){
            int n = sc.nextInt();
            for(int i = 2; i * i <= n; i++){
                while(n % i == 0){
                    sum += i;
                    n/=i;
                }
            }
            if(n > 1){
                sum += n;

            }
        }
        System.out.println(sum);
    }
}
