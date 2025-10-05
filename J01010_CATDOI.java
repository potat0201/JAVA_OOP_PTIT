import java.util.Scanner;

public class J01010_CATDOI {
    public static int catdoinoisau(int n){
        if(n == 0) return 0;
        else if(n == 1) return 1;
        else if(n == 8) return 0;
        else if(n == 9) return 0;
        else return 2;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            long n = sc.nextLong();

        }
    }
}
