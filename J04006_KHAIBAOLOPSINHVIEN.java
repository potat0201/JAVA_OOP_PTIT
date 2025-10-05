//import java.util.*;
//
//class sinhVien{
//    private String msv;
//    private String ten;
//    private String lop;
//    private String ns;
//    private float gpa;
//
//    public sinhVien(){
//        this.msv = "";
//        this.ten = "";
//        this.lop = "";
//        this.ns = "";
//        this.gpa = 0;
//    }
//
//    public sinhVien(String msv, String ten, String lop, String ns, float gpa){
//        this.msv = msv;
//        this.ten = ten;
//        this.lop = lop;
//        this.ns = chuanHoa(ns);
//        this.gpa = gpa;
//    }
//
//    public String chuanHoa(String ns){
//        String[] part = ns.split("/");
//        String d = part[0];
//        String m = part[1];
//        String y = part[2];
//
//        if(d.length() == 1) d = "0" + d;
//        if(m.length() == 1) m = "0" + m;
//
//        return d + "/" + m + "/" + y;
//    }
//
//    @Override
//    public String toString(){
//        return String.format("%s %s %s %s %.2f", msv, ten, lop, ns, gpa);
//    }
//}
//
//public class J04006_KHAIBAOLOPSINHVIEN {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String msv = "B20DCCN001";
//        String ten = sc.nextLine();
//        String lop = sc.next();
//        String ns = sc.next();
//        float gpa = sc.nextFloat();
//        sinhVien a = new sinhVien(msv, ten, lop, ns, gpa);
//
//        System.out.println(a);
//    }
//
//}
