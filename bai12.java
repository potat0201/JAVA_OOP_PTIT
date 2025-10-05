import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        String traloi = (n >= 8) ? "Giỏi" :
                ((n >=6.5 && n < 8)? "Khá":
                    (n < 6.5 && n >= 5) ? "Trung Bình" : "Yếu"
        );
        System.out.println(traloi);
    }
}
