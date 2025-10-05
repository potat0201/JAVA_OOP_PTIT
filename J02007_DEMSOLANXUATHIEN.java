//import java.util.*;
//
//public class J02007_DEMSOLANXUATHIEN {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        for(int i = 1; i <= t; i++){
//            int n = sc.nextInt();
//            int[] a = new int[n];
//            int[] cnt = new int[10005];
//            for(int j = 0; j < n; j++){
//                a[j] = sc.nextInt();
//                cnt[a[j]]++;
//            }
//            System.out.printf("Test %d\n:", t);
//            for(int i = 0; i < n; i++){
//                if(cnt[a[i]] > 0){
//                    System.out.printf("%d xuat hien %d lan", a[i], cnt[a[i]]);
//                    cnt[a[i]] = 0;
//                }
//            }
//
//        }
//    }
//}
