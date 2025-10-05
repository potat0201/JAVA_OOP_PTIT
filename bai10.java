import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ban kinh : ");
        double r = sc.nextDouble();
        double cv = 2 * Math.PI * r;
        double s = Math.PI * Math.pow(r,2);

        System.out.println("Chu vi = " + cv);
        System.out.println("Dien tich = " +s);

    }
}

