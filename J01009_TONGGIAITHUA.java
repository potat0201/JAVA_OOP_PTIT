import java.util.Scanner;

public class J01009_TONGGIAITHUA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long tmp = 1;
        long sum = 0;
        for(int i = 1; i <= n; i++){
            tmp *= i;
            sum += tmp;
        }
        System.out.println(sum);
    }
}
