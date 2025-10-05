import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao tong hai so : ");
        int tong = sc.nextInt();
        System.out.println("Nhap vao hieu hai so : ");
        int hieu = sc.nextInt();

        float x = (float)(tong + hieu) / 2;
        float y = (float)(tong - hieu) / 2;
        System.out.println("Gia tri x can tim la : "+x);
        System.out.println("Gia tri y can tim la : "+y);

    }
}
