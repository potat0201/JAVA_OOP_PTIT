import java.util.*;

class chamCong{
    private String mnv, ten;
    private int luong, thuong, phucap;

    public chamCong(String ten, int luongcb, int ngaycong, String chucvu){
        this.mnv = "NV01";
        this.ten = ten;
        this.luong = luongcb * ngaycong;

        if(ngaycong >= 25){
            this.thuong = (int)(luong* 0.2);
        } else if (ngaycong >=22 && ngaycong < 25) {
            this.thuong = (int)(luong * 0.1);
        }
        else this.thuong = 0;

        if(chucvu.equals("GD")){
            this.phucap = 250000;
        } else if (chucvu.equals("PGD")) {
            this.phucap = 200000;
        } else if (chucvu.equals("TP")) {
            this.phucap = 180000;
        }
        else this.phucap = 150000;
    }

    public int thunhap(){
        return luong + thuong + phucap;
    }

    @Override
    public String toString(){
        return mnv + " " + ten + " " + luong + " " + thuong + " " + phucap + " " + thunhap();
    }

}

public class J04012_BAITOANTINHCONG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        int luongcb = sc.nextInt();
        int ngaycong = sc.nextInt();
        String chucvu = sc.next();
        chamCong nv = new chamCong(ten, luongcb, ngaycong, chucvu);
        System.out.println(nv);

    }
}
