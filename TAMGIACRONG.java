import java.util.Scanner;

public class TAMGIACRONG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            if (i == 1) {
                System.out.println("*");
            } else if (i == N) {
                for (int j = 1; j <= 2 * N - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                System.out.print("*");
                for (int j = 1; j <= 2 * i - 3; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }
}
