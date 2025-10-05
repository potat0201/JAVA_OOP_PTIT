import java.util.*;

class thiSinh{
    public String mts, ten, trangthai;
    public int khuvuc;
    public double diem, diemcong, diemtong;

    public thiSinh(String mts, String ten, double toan, double ly, double hoa) {
        this.mts = mts;
        this.ten = ten;
        this.khuvuc = mts.charAt(2) - '0';;
        this.diem = toan*2 + ly + hoa;
        if (khuvuc == 1){
            this.diemcong = 0.5;
        } else if (khuvuc == 2) {
            this.diemcong = 1.0;
        }
        else{
            this.diemcong = 2.5;
        }
        this.diemtong = this.diem + this.diemcong;

        if(this.diemtong < 24){
            this.trangthai = "TRUOT";
        }
        else{
            this.trangthai = "TRUNG TUYEN";
        }
    }

    public String formatNum(double x){
        if( x == (long) x) return String.format("%d",(long)x);
        else return String.format("%.1f", x);
    }

    @Override
    public String toString(){
        return mts + " " + ten + " " + formatNum(diemcong) + " " + formatNum(diem) + " " + trangthai;
    }
}

public class J04013_BAITOANTUYENSINH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mts = sc.nextLine();
        String ten = sc.nextLine();
        double toan = sc.nextDouble();
        double ly = sc.nextDouble();
        double hoa = sc.nextDouble();
        thiSinh a = new thiSinh(mts, ten, toan, ly, hoa);
        System.out.println(a);
    }
}
