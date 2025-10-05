import java.util.Scanner;

public class J01005_CHIATAMGIAC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            int h = sc.nextInt();
            double h1 = (double)(h / Math.sqrt((double)n));
            for(int j = 1; j <= n-1; j++){
                double hn = h1 * Math.sqrt(j);
                System.out.printf("%.6f ",hn);
            }
            System.out.println();
        }
    }
}
