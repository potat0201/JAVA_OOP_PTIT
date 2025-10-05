import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int cnt = 0;
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == '4' || n.charAt(i) == '7') {
                cnt += 1;
            }
        }
        if (cnt == 4 || cnt == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
