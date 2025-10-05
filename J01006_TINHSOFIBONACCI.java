import java.util.Scanner;

public class J01006_TINHSOFIBONACCI {
    public static long fibo(int n){
        long f1 = 1, f2= 1,fn = 0;
        for(int i = 3; i <= n;i++){
            fn = f1 + f2;
            f1 = f2;
            f2 = fn;
        }
        return f2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            System.out.println(fibo(n));
        }
    }
}
