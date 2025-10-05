import java.util.Scanner;

public class J01011_BOISOCHUNGUOCSOCHUNG {
    public static long gcd(long a, long b){
        while(b != 0){
            long tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static long lcm(long a, long b){
        return (a / gcd(a,b)) * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long a = sc.nextInt();
            long b = sc.nextInt();
            System.out.println(lcm(a,b) + " " + gcd(a,b));
        }
    }
}
