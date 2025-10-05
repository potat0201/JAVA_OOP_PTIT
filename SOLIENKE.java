import java.util.Scanner;

public class SOLIENKE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            String n = sc.next();
            if (check(n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean check(String n) {
        for (int i = 1; i < n.length(); i++) {
            int d1 = n.charAt(i - 1) - '0';
            int d2 = n.charAt(i) - '0';
            if (Math.abs(d1 - d2) != 1) return false;
        }
        return true;
    }
}
