import java.util.Scanner;

public class baitap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String n = sc.next();
            boolean check = true;
            for (int i = 0; i < n.length() - 1; i++) {
                int kc = Math.abs(n.charAt(i) - n.charAt(i+1));
                if (kc != 1) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

