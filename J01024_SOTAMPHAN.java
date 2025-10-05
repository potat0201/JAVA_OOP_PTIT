import java.util.Scanner;

public class J01024_SOTAMPHAN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            String n = sc.next();
            boolean check = true;
            for(int i = 0; i <= n.length(); i++){
                if(n.charAt(i) != '0' && n.charAt(i) != '1' && n.charAt(i) != '2'){
                    System.out.println("NO");
                    check = false;
                    break;
                }
            }
            if(check == true){
                System.out.println("YES");
            }
        }
    }
}
