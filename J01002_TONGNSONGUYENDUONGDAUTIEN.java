import java.util.Scanner;

public class J01002_TONGNSONGUYENDUONGDAUTIEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i <  t; i++){
            long n = sc.nextLong();
            long tong = n * (n + 1) / 2;
            System.out.println(tong);
        }
        sc.close();
    }
}
