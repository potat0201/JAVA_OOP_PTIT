import java.util.*;

class giaoVien{
    private String mgv, ten;
    private long bacluong, phucap, thunhap;

    public giaoVien(String mgv, String ten, int luongcb){
        this.mgv = mgv;
        this.ten = ten;

        this.bacluong = Integer.parseInt(mgv.substring(mgv.length() - 2));

        if(mgv.substring(0,2).equals("HT")){
            this.phucap = 2000000;
        } else if (mgv.substring(0,2).equals("HP")) {
            this.phucap = 900000;
        } else{
            this.phucap = 500000;
        }

        this.thunhap = luongcb * this.bacluong + this.phucap;
    }

    @Override
    public String toString(){
        return mgv + " " + ten + " " + bacluong + " " + phucap + " " + thunhap;
    }
}

public class J04015_TINHTHUNHAPGIAOVIEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mgv = sc.nextLine();
        String ten = sc.nextLine();
        int luongcb = sc.nextInt();
        giaoVien a = new giaoVien(mgv ,ten , luongcb);
        System.out.println(a);
    }
}
