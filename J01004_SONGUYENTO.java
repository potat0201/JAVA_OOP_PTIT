//import java.util.Scanner;
//
//public class J01004_SONGUYENTO {
//    public static boolean checkprime(int n){
//        if( n < 2 ) return false;
//        for(int i = 2; i*i <= n; i++){
//            if(n % i == 0){
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        for( int i = 0; i < t; i++){
//            long n = sc.nextLong();
//            if(checkprime(n)){
//                System.out.println("YES");
//            }
//            else{
//                System.out.println("NO");
//            }
//
//        }
//
//    }
//}
