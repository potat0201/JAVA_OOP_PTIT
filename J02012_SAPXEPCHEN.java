import java.util.*;

public class J02012_SAPXEPCHEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            int id = i;
            while( id > 0 && a[id] < a[id- 1]){
                int tmp = a[id- 1];
                a[id-1] = a[id];
                a[id] = tmp;
                id--;
            }
            System.out.printf("Buoc %d:",i);
            for(int k = 0; k <=i ; k++){
                System.out.print(" "+a[k]);
            }

            System.out.println();
        }
    }
}
