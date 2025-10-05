import java.util.*;
import java.util.TreeSet;

public class J03009_TAPTURIENGCUAHAIXAU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            TreeSet<String> ts1 = new TreeSet<>();
            TreeSet<String> ts2 = new TreeSet<>();
            String s1[] = sc.nextLine().trim().split("\\s+");
            for(int i = 0; i < s1.length; i ++){
                ts1.add(s1[i]);
            }
            String s2[] = sc.nextLine().trim().split("\\s+");
            for(int i = 0; i < s2.length; i ++){
                ts2.add(s2[i]);
            }
            ts1.removeAll(ts2);
            for(String s:ts1){
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}
