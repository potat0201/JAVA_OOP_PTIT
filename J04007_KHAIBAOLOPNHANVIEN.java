import java.util.*;

class nhanVien{
    private String mnv, ten, gender, ns, address, taxid, workid;

    public nhanVien( String mnv, String ten, String gender, String ns, String address, String taxid, String workid){
        this.mnv = mnv;
        this.ten = ten;
        this.gender = gender;
        this.ns = ns;
        this.address = address;
        this.taxid = taxid;
        this.workid = workid;
    }

    @Override
    public String toString(){
        return mnv + " " + ten + " " + gender + " " + ns + " " + address + " " + taxid + " " + workid;
    }
}

public class J04007_KHAIBAOLOPNHANVIEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mnv = "00001";
        String name = sc.nextLine();
        String gender = sc.nextLine();
        String ns = sc.nextLine();
        String address = sc.nextLine();
        String taxid = sc.nextLine();
        String wordid = sc.nextLine();
        nhanVien a = new nhanVien(mnv, name, gender, ns, address, taxid, wordid);
        System.out.println(a);

    }
}
