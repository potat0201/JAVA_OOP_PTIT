import java.util.*;

class phanSo{
    private long x, y;

    public phanSo(long x, long y){
        this.x = x;
        this.y = y;
        rutGon();
    }

    private long gcd(long a, long b) {
        while (b != 0) {
            long tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }

    private void rutGon(){
        long g = gcd(x,y);
        x /= g;
        y /= g;
    }

    @Override
    public String toString(){
        return x + "/" + y;
    }

}

public class J04003_PHANSO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();

        phanSo p = new phanSo(x, y);
        System.out.println(p);
    }
}
