//import java.util.*;
//
//class thiSinh{
//    private String ten;
//    private String ns;
//    private double diem1;
//    private double diem2;
//    private double diem3;
//
//    public thiSinh(String ten,String ns,double diem1,double diem2,double diem3){
//        this.ten = ten;
//        this.ns = ns;
//        this.diem1 = diem1;
//        this.diem2 = diem2;
//        this.diem3 = diem3;
//    }
//
//    public double tinhTong(thiSinh p){
//        return p.diem1 + p.diem2 + p.diem3;
//    }
//}
//
//public class J04005_KHAIBAOLOPTHISINH {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String ten = sc.nextLine();
//        String ns = sc.next();
//        double diem1 = sc.nextDouble();
//        double diem2 = sc.nextDouble();
//        double diem3 = sc.nextDouble();
//        thiSinh p = new thiSinh(ten, ns, diem1, diem2, diem3);
//        double ans = p.tinhTong(p);
//        System.out.printf("%s %s %.1f", ten, ns, ans);
//
//    }
//
//
//}
