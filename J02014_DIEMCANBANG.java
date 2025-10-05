import java.util.Scanner;

public class J02014_DIEMCANBANG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            int b[] = new int[n];
            b[0] = a[0];
            for(int i = 1; i < n; i++){
                b[i] = a[i] + b[i-1];
            }

            boolean check = false;
            for(int i = 1; i < n; i++){
                if(b[i-1] == b[n-1] - b[i]){
                    System.out.println(i+1);
                    check = true;
                    break;
                }
            }

            if(!check) System.out.println(-1);
        }
    }

}