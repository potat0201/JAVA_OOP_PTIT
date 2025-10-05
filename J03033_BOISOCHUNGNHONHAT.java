//import java.math.BigInteger;
//import java.util.*;
//
//public class J03033_BOISOCHUNGNHONHAT {
//    public static BigInteger gcd(BigInteger a, BigInteger b){
//        while( b != (BigInteger.ZERO) ){
//            BigInteger tmp = b;
//            b = a % b;
//            a = tmp;
//        }
//        return a;
//    }
//
//    public static BigInteger lcm(BigInteger a, BigInteger b){
//        return (a/ gcd(a, b))* b;
//    }
//
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        sc.nextLine();
//        while(t-- > 0){
//            BigInteger a = new BigInteger(sc.nextLine());
//            BigInteger b = new BigInteger(sc.nextLine());
//
//            BigInteger ans = lcm(a,b);
//            System.out.println(ans);
//        }
//    }
//}
