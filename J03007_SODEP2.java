import java.util.*;


public class J03007_SODEP2 {
    public static long tong(String n){
        long sum = 0;
        for(int i = 0; i < n.length(); i++){
            sum += (n.charAt(i) - '0');
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            boolean check = true;
            if(tong(s) % 10 != 0){
                check = false;
            }

            if(s.charAt( s.length()-1 ) != '8'){
                check = false;
            }
            else{
                for(int i = 0; i < s.length(); i++){
                    if( s.charAt(i) != s.charAt(s.length()-i-1)){
                        check = false;
                        break;
                    }
                }
            }
            if(check) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
