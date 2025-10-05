//import java.util.*;
//
//public class TONGUOCSO_2 {
//    public static long tonguocso(int n){
//        int tong = 0;
//        for(int i = 1; i <= Math.sqrt(n); i++){
//            if (n % i == 0){
//                tong += i;
//            }
//        }
//        return tong;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int x, y = sc.nextInt();
//        int cnt = 0;
//        for(int i = x; i <= y ; i++){
//            if( tonguocso(i) > i ){
//                cnt++;
//            }
//        }
//        System.out.println(cnt);
//    }
//}
