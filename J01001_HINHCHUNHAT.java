import java.util.Scanner;

public class J01001_HINHCHUNHAT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dai = sc.nextInt();
        int rong = sc.nextInt();
        int p = (dai + rong)*2;
        int s = dai*rong;
        if(dai <= 0|| rong <= 0){
            System.out.println("0");
        }
        else{
            System.out.print(p);
            System.out.print(" "+s);
        }
    }
}
