import java.util.*;

public class SinhVien {
    private  String msv, ten, lop, email;

    public SinhVien(String msv, String ten, String lop, String email){
        this.msv = msv;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    @Override
    public String toString(){
        return msv + " " + ten + " " + lop + " " + email;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<SinhVien> arr = new ArrayList<>();

        for(int i = 0; i < n; i++){
            arr.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));

        }
        arr.sort(new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if(!o1.getLop().equals(o2.getLop())){
                    return o1.getLop().compareTo(o2.getLop());
                }
                else{
                    return o1.getMsv().compareTo(o2.getMsv());
                }
            }
        });
        for(SinhVien a : arr){
            System.out.println(a);
        }
    }
}
