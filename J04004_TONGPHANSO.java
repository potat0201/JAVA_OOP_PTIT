import java.util.*;

class PhanSo {
    private long tu, mau;

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
        rutGon();
    }

    private long gcd(long a, long b) {
        while (b != 0) {
            long tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    private void rutGon() {
        long g = gcd(Math.abs(tu), Math.abs(mau));
        tu /= g;
        mau /= g;
    }

    public PhanSo cong(PhanSo other) {
        long tuMoi = this.tu * other.mau + other.tu * this.mau;
        long mauMoi = this.mau * other.mau;
        return new PhanSo(tuMoi, mauMoi);
    }

    @Override
    public String toString() {
        return tu + "/" + mau;
    }
}

public class J04004_TONGPHANSO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        PhanSo p = new PhanSo(a, b);
        PhanSo q = new PhanSo(c, d);

        PhanSo tong = p.cong(q);
        System.out.println(tong);
    }
}