import java.util.Scanner;

public class J02034_BOSUNGDAYSO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean [] a = new boolean[201];
        int max = -1;
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            a[x] = true;
            if(x > max){
                max = x;
            }
        }
        boolean check = false;
        for(int i = 1; i <= max; i++){
            if(a[i] == false){
                System.out.println(i);
                check = true;
            }
        }

        if(!check && max >= 1){
            System.out.println("Excellent!");
        }
    }
}
