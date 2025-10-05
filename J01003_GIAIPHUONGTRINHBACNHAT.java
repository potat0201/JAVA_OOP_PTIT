import java.util.Scanner;

public class J01003_GIAIPHUONGTRINHBACNHAT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            if( a != 0){
                double ans = -b / a;
                System.out.printf("%.2f\n",ans);
            } else if ( a == 0 && b == 0) {
                System.out.println("VSN");
            }
            else{
                System.out.println("VN");
            }
        }

    }

