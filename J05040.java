import java.util.*;

class NhanVien {
    private String mnv, ten;
    private long luongcb;
    private byte songaycong;
    private String chucVu;

    private long thuong;
    private int phucap;
    private long thunhap;
    private long luongthang;
    private static int stt = 1;

    public NhanVien(String ten, long luongcb, byte songaycong, String chucVu) {
        this.ten = ten;
        this.luongcb = luongcb;
        this.songaycong = songaycong;
        this.chucVu = chucVu;
        this.mnv = String.format("NV%02d", stt++);

        this.luongthang = luongcb * songaycong;
        this.thuong = tinhThuong();
        this.phucap = tinhPhucap();
        this.thunhap = tinhThunhap();
    }

    private long tinhThuong() {
        if (songaycong >= 25) return (long)(luongthang * 0.2);
        else if (songaycong >= 22) return (long)(luongthang * 0.1);
        return 0;
    }

    private int tinhPhucap() {
        switch (chucVu) {
            case "GD": return 250000;
            case "PGD": return 200000;
            case "TP": return 180000;
            default: return 150000;
        }
    }

    private long tinhThunhap() {
        return luongthang + thuong + phucap;
    }

    @Override
    public String toString() {
        return mnv + " " + ten + " " + luongthang + " " + thuong + " " + phucap + " " + thunhap;
    }
}

public class J05040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String ten = sc.nextLine();
            long luongcb = Long.parseLong(sc.nextLine());
            byte songaycong = Byte.parseByte(sc.nextLine());
            String chucVu = sc.nextLine();

            arr.add(new NhanVien(ten, luongcb, songaycong, chucVu));
        }

        for (NhanVien nv : arr) {
            System.out.println(nv);
        }
    }
}
