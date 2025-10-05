import java.util.Scanner;

public class J01012_UOCSOCHIAHETCHO2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            int cnt = 0;
            for (int j = 1; j * j <= n; j++) {
                if (n % j == 0) { // j là ước
                    int k = n / j; // ước đối
                    if (j % 2 == 0) cnt++;
                    if (k % 2 == 0 && k != j) cnt++; // tránh đếm lặp khi j*j = n
                }
            }
            System.out.println(cnt);
        }
    }
}
