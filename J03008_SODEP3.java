import java.util.*;


public class J03008_SODEP3 {
    public static boolean check_prime(char a){
        int x = a - '0';
        if(x < 2) return false;
        else{
            for(int i = 2; i < Math.sqrt(x) + 1; i++){
                if(x % i == 0) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s = sc.nextLine();
            boolean check = true;
            for(int i = 0; i < s.length(); i++){
                if(!check_prime( s.charAt(i)) || s.charAt(i) != s.charAt(s.length() - i - 1)){
                    check = false;
                    break;
                }
            }

            if(check) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
