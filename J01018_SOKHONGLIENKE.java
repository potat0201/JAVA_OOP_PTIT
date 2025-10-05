import java.util.Scanner;

public class J01018_SOKHONGLIENKE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            String n = sc.next();
            if(check(n) && tong(n) == 10){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
    }

    public static long tong(String n){
        long sum = 0;
        for(int i = 0; i < n.length(); i++){
            sum += n.charAt(i) - '0';
        }
        return sum;
    }

    public static boolean check(String n){
        for(int i = 1; i < n.length(); i++){
            int d1 = n.charAt(i - 1) - '0';
            int d2 = n.charAt(i) - '0';
            if(Math.abs(d1 - d2) != 2) return false;
        }
        return true;
    }
}
