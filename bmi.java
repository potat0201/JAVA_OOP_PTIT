import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chieu cao : ");
        float cao = sc.nextFloat();
        System.out.println("Nhap vao can nang : ");
        float nang = sc.nextFloat();
        float bmi = nang / (float)Math.pow(cao, 2);
        System.out.println("BMI cua ban = "+bmi);

        if ( bmi < 19 ){
            System.out.println("Gay");
        }
        else if(bmi >19 && bmi < 26){
            System.out.println("Vua");
        }
        else
        {
            System.out.println("Beo");
        }


    }
}
