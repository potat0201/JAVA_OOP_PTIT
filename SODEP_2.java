import java.util.Scanner;

public class SODEP_2 {

    public static boolean laSoDep(String s) {
        if (s.charAt(0) != '8' || s.charAt(s.length() - 1) != '8') {
            return false;
        }

        StringBuilder sb = new StringBuilder(s);
        if (!s.equals(sb.reverse().toString())) {
            return false;
        }
        int sum = 0;
        for (char c : s.toCharArray()) {
            sum += c - '0';
        }
        if (sum % 10 != 0) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();
            scanner.nextLine();

            while (t-- > 0) {
                String n = scanner.nextLine();
                if (laSoDep(n)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
}