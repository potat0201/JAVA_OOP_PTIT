//import java.util.HashMap;
//import java.util.Scanner;
//
//public class J03010_DIACHIEMAIL {
//    public static void main(String[] args) {
//        import java.util.*;
//        public class J03010_DIACHIEMAIL {
//            Scanner sc = new Scanner(System.in);
//            int t = sc.nextInt();
//            sc.nextLine();
//            HashMap<String, Integer> mp = new HashMap<>();
//            while(t-->0){
//                String []s=sc.nextLine().trim().toLowerCase().split("\\s+");
//                StringBuilder sb = new StringBuilder();
//                sb.append(s[s.length-1]); // tạo hậu tố @ptit.edu.vn
//                for(int i = 0;i < s.length -1;i++){
//                    sb.append(s[i].charAt(0));
//                }
//                if(mp.containsKey(sb.toString())){ // thứ tự nếu tên trùng
//                    int tt = mp.get(sb.toString());
//                    tt++;
//                    mp.replace(sb.toString(),tt);
//                    sb.append(tt);
//                } else{
//                    mp.put(sb.toString(), 1);
//                }
//                sb.append("@ptit.edu.vn")
//                System.out.println(sb);
//            }
//        }
//    }
//}
//
//    }
//}
