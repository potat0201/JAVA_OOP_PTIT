import java.util.*;

public class J02013_SAPXEPNOIBOT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0 ; i < n - 1; i++){
            boolean check = false;
            for(int j = 0 ; j < n - i - 1; j++){
                if(a[j] > a[j + 1]){
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j+1] = tmp;
                    check = true;
                }
            }
            if(!check){
                break;
            }
            else{
                System.out.printf("Buoc %d:", i+1);
                for(int k = 0 ; k < n; k++){
                    System.out.print(" "+ a[k] );
                }
            }
            System.out.println();
        }
    }
}
