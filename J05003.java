import java.util.*;

class sinhVien {
    private String msv;
    private String ten;
    private String lop;
    private String ns;
    private float gpa;
    private static int cnt = 1;

    public sinhVien(String ten, String lop, String ns, float gpa) {
        this.msv = String.format("B20DCCN%03d",cnt++);
        this.ten = ten;
        this.lop = lop;
        this.ns = chuanHoa(ns);
        this.gpa = gpa;
    }

    private String chuanHoa(String ns) {
        String[] part = ns.split("/");
        String d = part[0];
        String m = part[1];
        String y = part[2];
        if (d.length() == 1) d = "0" + d;
        if (m.length() == 1) m = "0" + m;
        return d + "/" + m + "/" + y;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %.2f", msv, ten, lop, ns, gpa);
    }
}

public class J05003{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        sinhVien []ds = new sinhVien[n];

        for(int i = 0;i < n; i++){
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String ns = sc.nextLine();
            float gpa = Float.parseFloat(sc.nextLine());
            ds[i] = new sinhVien(ten, lop, ns, gpa);
        }

        for(sinhVien a : ds){
            System.out.println(a);
        }

    }
}
