import java.util.*;

public class J03005_CHUANHOAXAUHOTEN_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String[] s = sc.nextLine().trim().toLowerCase().split("\\s+");
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i < s.length; i++) {
                sb.append(Character.toUpperCase(s[i].charAt(0)))
                        .append(s[i].substring(1))
                        .append(" ");
            }
            String ho = s[0].toUpperCase();
            System.out.println(sb.toString().trim() + ", " + ho);
        }
    }
}
