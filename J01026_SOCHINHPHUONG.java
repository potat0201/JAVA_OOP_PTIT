import java.util.Scanner;

public class J01026_SOCHINHPHUONG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = (int)Math.sqrt(n);
            if(k*k == n){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
